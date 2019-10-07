package com.example.employeeData.writer;

import com.example.employeeData.Employee;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvFile implements IWriter {
    @Override
    public void writeFiles(String location ,List list) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        File file = new File(location + "csvFile.csv");
        CsvSchema csvSchema = csvMapper.schemaFor(Employee.class);
        csvMapper
                .writer(csvSchema)
                .writeValue(file,list);
        if(file.exists())
             System.out.println("CSV FIle  Saved  Successfully");
        else
            System.out.println("Wrong Path");
    }
}
