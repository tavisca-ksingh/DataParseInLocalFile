package com.example.employeeData;

public class Employee {
    private  int id;
    private String e_name;
    private int dept_id;
    private  double salary;
    private Dept dept;

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

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
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
