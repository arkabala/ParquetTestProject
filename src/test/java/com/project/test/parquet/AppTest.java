package com.project.test.parquet;

import org.junit.Test;

public class AppTest {

    public static final String csvInputFile="src/test/resources/data/employee.csv";
    public static final String parquetOutputFile="build/output/employee_parquet_output_file.csv";
    public static final String csvOutputFile="build/output/employee_csv_output_file.csv";;


    @Test
    public void test() throws Exception {
        App.main(new String[]{csvInputFile,parquetOutputFile,csvOutputFile});

    }
}
