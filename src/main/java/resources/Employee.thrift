namespace java com.project.test.parquet.thrift.domain

struct Employee {
  1: required i64 emp_id,
  2: required string first_name,
  3: required string last_name,
  4: optional string email
}