package com.example.employeeData.pojo;

import com.fasterxml.jackson.xml.annotate.JacksonXmlProperty;
import java.io.Serializable;


public class Employee implements Serializable {
    private  int id;
    private String e_name;
    private int dept_id;
    private  double salary;
    @JacksonXmlProperty(localName = "department")
    private Dept dept;

    public Employee() {

    }


    public Employee(int id, String e_name,int dept_id, double salary ) {
        this.id = id;
        this.e_name = e_name;
        this.dept_id = dept_id;
        this.salary = salary;

    }

    public Employee(int id, String e_name,Dept dept, double salary ) {
        this.id = id;
        this.e_name = e_name;
        this.dept= dept;
        this.salary = salary;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public Dept getDept() {
        return dept;
    }



    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", e_name='" + e_name + '\'' +
                ", department =" + dept +
                ", salary=" + salary +
                "}\n";
    }
}
