package com.qmb.spring.iocxml.a4dilist;


public class Employee {
    private String name;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void work()
    {
        System.out.println("姓名:" + name +"年龄：" + age + " work.... ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
