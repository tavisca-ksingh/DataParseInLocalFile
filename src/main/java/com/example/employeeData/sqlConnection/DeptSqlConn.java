package com.example.employeeData.sqlConnection;

import com.example.employeeData.pojo.Dept;
import com.example.employeeData.pojo.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeptSqlConn {

    public static List<Employee> employeeList =new LinkedList<>();
    public static List<Dept> departmentList = new ArrayList<>();
    public static void readSql() {
        try {
            //get a connection to database
            Connection myConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee", "root", "root");
            //Statement
            Statement statement=myConn.createStatement();
            Statement statement1=myConn.createStatement();

            //SQL Query
            ResultSet resultSetDept = statement1.executeQuery("Select * from department");
            ResultSet resultSet = statement.executeQuery("Select * from employee");
            // Process The result Set
            ProcessTheResultSetIntoList(resultSet);
            ProcessDeptResultIntoList(resultSetDept);
            System.out.println("Employee List ");
            System.out.println(employeeList);
            System.out.println("Department List");
            System.out.println(departmentList);
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }

    private static void ProcessDeptResultIntoList(ResultSet resultSet) throws SQLException {
        int id;
        String dept_name;
        while (resultSet.next()){
            id= Integer.parseInt(resultSet.getString("id"));
            dept_name =  resultSet.getString("dept_name" );
            departmentList.add(new Dept(id,dept_name,  getEmployee(id)));
        }
    }
    public static List<Employee> getEmployee(int id){
        List<Employee> employee = new ArrayList<>();

        for(Employee emp: employeeList) {
            if (emp.getDept_id() == id ) {
                    employee.add(emp);
            }
        }

        return employee;
    }



    private static void ProcessTheResultSetIntoList(ResultSet resultSet) throws SQLException {
        int id;
        double Salary;
        int dept_id;
        String e_name;
        while (resultSet.next()){
            id= Integer.parseInt(resultSet.getString("id"));
            e_name=resultSet.getString("e_name") ;
            dept_id = Integer.parseInt( resultSet.getString("dept_id" ));
            Salary = Integer.parseInt( resultSet.getString("Salary"));
            employeeList.add(new Employee(id,e_name,dept_id,Salary));
        }
    }


}
