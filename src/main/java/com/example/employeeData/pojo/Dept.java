package com.example.employeeData.pojo;


import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;
import com.fasterxml.jackson.xml.annotate.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement( localName = "Department")
public class Dept extends Employee {
    @JacksonXmlProperty(localName = "dept_id")
    private int id;
    private String dept_name;
   private List<Employee> employee;
    public Dept(int id, String dept_name) {
        this.id = id;
        this.dept_name = dept_name;
    }


    public Dept(int id, String dept_name, List<Employee> employee) {
        this.id = id;
        this.dept_name = dept_name;
        this.employee =employee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", dept_name='" + dept_name + '\'' +
                "]\n";
    }
}
