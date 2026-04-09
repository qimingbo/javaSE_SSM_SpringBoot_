package com.qmb.spring.iocxml.a3ditest;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private Department dept;
    private String[] hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void work()
    {
        System.out.println("姓名:" + name +"年龄：" + age + " work.... ");
        dept.show();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
