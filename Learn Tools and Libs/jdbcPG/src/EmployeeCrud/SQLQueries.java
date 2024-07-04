package EmployeeCrud;

public class SQLQueries {
    public static final String insert = "insert into emp_info (emp_id, emp_name, emp_email, emp_salary) values (?,?,?,?)";
    public static final String update = "update emp_info set emp_name = ?, emp_email = ?, emp_salary = ? where emp_id = ?";
    public static final String read = "select * from emp_info";
    public static final String readSingle = "select * from emp_info where emp_id = ?";
    public static final String delete = "delete from emp_info where emp_id = ?";
}
