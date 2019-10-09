package com.example.employeeData.main;

import com.example.employeeData.sqlConnection.DeptSqlConn;
import com.example.employeeData.writer.XmlFileDeptWriter;

import java.io.IOException;
import java.util.Scanner;

public class DepartmentMain {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the location You want to Save Your File : ");
        DeptSqlConn.readSql();
        String location= sc.nextLine();
            XmlFileDeptWriter.writeFiles( location, DeptSqlConn.departmentList);
            System.out.println(" Department file created");
    }
}
