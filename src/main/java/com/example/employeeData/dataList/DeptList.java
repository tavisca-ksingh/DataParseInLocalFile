package com.example.employeeData.dataList;

import com.example.employeeData.pojo.Dept;

import java.util.ArrayList;
import java.util.List;

public class DeptList {
    List<Dept> department =new ArrayList<>();

    public DeptList(List<Dept> department) {
        this.department = department;
    }

    public List<Dept> getDepartment() {
        return department;
    }

    public void setDepartment(List<Dept> department) {
        this.department = department;
    }
}
