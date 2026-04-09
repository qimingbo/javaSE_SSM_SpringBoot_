package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {
        // 需求：定义一个集合ArrayList,添加一些学生对象，并进行遍历。学生类的属性为：姓名和年龄。
        // 1、创建并添加
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 25));
        list.add(new Student("李四", 30));
        list.add(new Student("王五", 35));
        // 2、遍历输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println("学生姓名：" + list.get(i).getName() + " 年龄：" + list.get(i).getAge());
        }
    }
}
