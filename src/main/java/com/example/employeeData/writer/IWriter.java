package com.example.employeeData.writer;

import com.example.employeeData.pojo.Employee;

import java.io.IOException;
import java.util.List;

public interface IWriter {
    public void writeFiles(String location, List<Employee> list) throws IOException;

}
