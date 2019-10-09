package com.example.employeeData.writer;

import com.example.employeeData.pojo.Employee;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CsvFile implements IWriter {
    @Override
    public void writeFiles(String location ,List list) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        File file = new File(location+ "\\" + "csvFile.csv");

        CsvSchema csvSchema = csvMapper.schemaFor(Employee.class);

        if(file.createNewFile()) {
            csvMapper
                    .writer(csvSchema)
                    .writeValue(file,list);
            System.out.println("CSV FIle Saved Successfully");
        }
             else {
            if(file.exists())
            {
                File newfile = new File(location + "\\"  +  addDate());
                csvMapper
                        .writer(csvSchema)
                        .writeValue(newfile,list);
                System.out.println(addDate() + " File Created");
            }
            else
            System.out.println("Wrong Path");
        }

    }

    public static String addDate(){
        String pattern = "_HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String fileName = "csvFile"+ date +".csv";
        return fileName;
    }
}
