package com.qmb.a01exception;

public class Student2 {
    private String name;
    private int age;


    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student2(String s)
    {
        String[] stringArr = s.split("-");
        this.name = stringArr[0];
        this.age = Integer.parseInt(stringArr[1]);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}
