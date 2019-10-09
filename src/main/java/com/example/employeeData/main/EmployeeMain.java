package com.example.employeeData.main;


import com.example.employeeData.sqlConnection.DeptSqlConn;
import com.example.employeeData.sqlConnection.MySqlCon;
import com.example.employeeData.writer.*;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        MySqlCon mySqlCon = new MySqlCon();
        mySqlCon.readSql();

        System.out.println("\nPress 1 for Json \n" +
                "Press 2 For Xml \n"+
                "Press 3 Fro Csv \n");
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the location You want to Save Your File : ");
        String location= sc.nextLine();
        WriteIntoFiles(mySqlCon, input, location);
    }

    private static void WriteIntoFiles(MySqlCon mySqlCon, int input, String location) throws IOException {
        IWriter writer = null;
        switch (input){
            case 1:
                writer = new JsonFile();
                break;
            case 2:
                writer = new XmlFile();
                break;
            case 3:
                writer =  new CsvFile();
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }

        writer.writeFiles(location, mySqlCon.employeeList);
    }
}
