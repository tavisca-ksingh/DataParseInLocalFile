package com.example.employeeData.dataList;

import com.example.employeeData.pojo.Employee;
import com.fasterxml.jackson.xml.annotate.JacksonXmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@JacksonXmlRootElement(localName = "Employees")
public class EmployeesList implements Serializable {


    private List<Employee> employee = new ArrayList<>();

    public EmployeesList(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

}
