package com.qmb.spring.iocxml.a3ditest;

import java.util.List;

public class Department {
   // 部门名称
    private String dname;

    // 部门员工
    private List<Employee> empList;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                ", empList=" + empList +
                '}';
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void show(){
        System.out.println("部门名字:" + dname);
    }
}
