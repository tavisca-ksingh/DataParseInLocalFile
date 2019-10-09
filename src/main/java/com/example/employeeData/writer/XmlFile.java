package com.example.employeeData.writer;


import com.example.employeeData.dataList.EmployeesList;
import com.example.employeeData.pojo.*;

import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class XmlFile implements IWriter {



    public static String addDate(){
        String pattern = "_HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String fileName = "xmlFile"+ date +".xml";
        return fileName;
    }

    @Override
    public void writeFiles(String location, List list) throws IOException {

        XmlMapper xmlMapper =  new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(location + "//" + "xmlFile.xml"), new EmployeesList(list));
    }

    public void writeDemoFiles() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        // create a list of other phones
        List<String> otherPhones = Arrays.asList("OnePlus 6T", "OnePlus 5T", "OnePlus 5");

        // create the manufacturer object
        Manufacturer manufacturer = new Manufacturer("OnePlus", "China", otherPhones);

        // serialize our new Object into XML string
        String xmlString = xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(new PhoneDetails("OnePlus", "6.4", "6/64 GB", manufacturer));

        // write to the console
        System.out.println(xmlString);

        File xmlOutput = new File("serialized.xml");
        FileWriter fileWriter = new FileWriter(xmlOutput);
        fileWriter.write(xmlString);
        fileWriter.close();
    }
}
