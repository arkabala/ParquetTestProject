# To generate Employee.java class . Not necessary if already created
thrift --gen java -r -out src/main/java src/main/java/resources/Employee.thrift

# add data to hadoop
hadoop fs -mkdir data
hadoop fs -copyFromLocal ParquetTestProject/src/test/resources/data/employee.csv data/


# build project
mvn clean package -DskipTests=true

# copy lib to hadoop lib
cp target/lib/* $HADOOP_HOME/lib # copy to location referred to by HADOOP_CLASSPATH

# restart hadoop after copying lib


# run the following command to initiate conversion
hadoop jar target/ParquetTestProject-1.0-SNAPSHOT.jar data/employee.csv data/employee.parquet data/employee_email.csv

