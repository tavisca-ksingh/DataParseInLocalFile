package com.example.employeeData.writer;

import com.example.employeeData.pojo.Dept;
import com.example.employeeData.dataList.DeptList;
import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlFileDeptWriter{

    public static void writeFiles(String location, List<Dept> list) throws IOException {
        System.out.println(list);
        XmlMapper xmlMapper =  new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(location + "//" + "xmlFileDept1.xml"), new DeptList(list));
    }
}
