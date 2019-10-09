package com.example.employeeData.writer;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class JsonFile implements IWriter {
    @Override
    public void writeFiles(String location, List list) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(location+ "\\" + "jsonFile.json");

        if(file.createNewFile() ) {

            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, list);
            System.out.println("Json FIles Saved Successfully");
        }
        else
        {
            if(file.exists())
            {
              File newfile = new File(location + "\\"  +  addDate());
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(newfile, list);
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
        String fileName = "jsonFile"+ date +".json";
        return fileName;
    }

}
