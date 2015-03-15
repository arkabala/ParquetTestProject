package com.project.test.parquet;

import cascading.flow.Flow;
import cascading.flow.FlowProcess;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.operation.BaseOperation;
import cascading.operation.Function;
import cascading.operation.FunctionCall;
import cascading.pipe.Each;
import cascading.pipe.Pipe;
import cascading.scheme.Scheme;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;
import com.project.test.parquet.thrift.domain.Employee;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import parquet.cascading.ParquetTBaseScheme;
import parquet.cascading.ParquetTupleScheme;

public class App {

    /**
     * Arg 1 : Path of employee file
     * Arg 2 : Path to write employee file that has been converted to parquet
     * Arg3 : Path to write the employee file that has been converted back to csv from parquet
     *
     *
     * Converts CSV to parquet and back again. Only Employee files which are pipe delimited with four columns are supported. See employee.csv for sample
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        String csvEmployeeFile=args[0];
        String parquetOutputFile=args[1];
        String csvOutputFile=args[2];

        convertToParquet(csvEmployeeFile,parquetOutputFile);
        convertToCsv(parquetOutputFile,csvOutputFile);

    }

    /**
     * Convert file in txtInputPath to parquetOutput . File must be in employee Employee scheme. Source file must be pipe delimited with four columns, First column should be integer
     *
     * @param txtInputPath
     * @param parquetOutputPath
     * @throws Exception
     */
    public static void convertToParquet(String txtInputPath, String parquetOutputPath) throws Exception{
        Path path = new Path(parquetOutputPath);
        final FileSystem fs = path.getFileSystem(new Configuration());
        if (fs.exists(path)) fs.delete(path, true);

        Scheme sourceScheme = new TextDelimited( new Fields( "id","first", "last","email" ),"|");
        Tap source = new Hfs(sourceScheme, txtInputPath);

        Scheme sinkScheme = new ParquetTBaseScheme(Employee.class);
        Tap sink = new Hfs(sinkScheme, parquetOutputPath);

        Pipe assembly = new Pipe( "namecp" );
        assembly = new Each(assembly, new PackThriftFunction());
        Flow flow  = new HadoopFlowConnector().connect("namecp", source, sink, assembly);

        flow.complete();
    }

    /**
     * Converts parquet employee file to csv. Only first_name and email fields have been extracted.
     *
     * @param parquetInputPath
     * @param txtOutputPath
     * @throws Exception
     */
    public static void convertToCsv(String parquetInputPath, String txtOutputPath) throws Exception{
        Path path = new Path(txtOutputPath);
        final FileSystem fs = path.getFileSystem(new Configuration());
        if (fs.exists(path)) fs.delete(path, true);

        Scheme sourceScheme = new ParquetTupleScheme(new Fields("first_name","email"));
        Tap source = new Hfs(sourceScheme, parquetInputPath);

        Scheme sinkScheme = new TextDelimited(new Fields("first_name","email"),"|");
        Tap sink = new Hfs(sinkScheme, txtOutputPath);

        Pipe assembly = new Pipe("namecp");

        assembly = new Each(assembly,new Fields("first_name","email"), new ProjectedTupleFunction(),Fields.REPLACE);
        Flow flow = new HadoopFlowConnector().connect("namecp", source, sink, assembly);

        flow.complete();
    }




    /**
     * Convert Tuples to Thrift Domain
     */
    private static class PackThriftFunction extends BaseOperation implements Function {

        public void operate(FlowProcess flowProcess, FunctionCall functionCall) {
            TupleEntry arguments = functionCall.getArguments();
            Tuple result = new Tuple();

            Employee name = new Employee();
            name.setEmp_id(Long.valueOf(arguments.getString(0)));
            name.setFirst_name(arguments.getString(1));
            name.setLast_name(arguments.getString(2));
            name.setEmail(arguments.getString(3));

            result.add(name);
            functionCall.getOutputCollector().add(result);
        }
    }

    /**
     * Convert arguments to tuple
     */
    private static class ProjectedTupleFunction extends BaseOperation implements Function {

        private ProjectedTupleFunction() {
            super(Fields.ARGS);
        }

        public void operate(FlowProcess flowProcess, FunctionCall functionCall) {
            TupleEntry arguments = functionCall.getArguments();

            Tuple name = new Tuple();
            name.addString(arguments.getString(0));
            name.addString(arguments.getString(1));

            functionCall.getOutputCollector().add(name);
        }
    }
}
