package com.example.employeeData.writer;

import java.io.IOException;
import java.util.List;

public interface IWriter<Employee> {
    public void writeFiles(String location,List<Employee> list) throws IOException;
}
