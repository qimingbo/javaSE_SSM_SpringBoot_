package com.qmb.a02set;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student{name = " + name + ", age = " + age + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        // 这个规则只比较年龄
        // this:当前要添加的元素
        // o:红黑树中存在的元素
        // 返回值：
        //         负数:认为要添加的值是小的,存左边
        //         正数:认为要添加的值是大的,存右边
        //         0:认为要元素已经存在,舍弃
        System.out.println("-----------------------");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        return this.getAge() - o.getAge();
    }
}
