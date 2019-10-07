package com.example.employeeData.writer;

import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlFile implements IWriter {
    @Override
    public void writeFiles(String location,List list) throws IOException {
        XmlMapper mapper = new XmlMapper();
        File file = new File(location + "xmlFile.xml");
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(file,list);
        if(file.exists()) {
            System.out.println("Xml File Saved Successfully");
        }
        else{
            System.out.println("Wrong Path");
        }
    }
}
