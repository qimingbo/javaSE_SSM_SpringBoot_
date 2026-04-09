package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList06 {
    public static void main(String[] args) {
        // 需求：定义一个集合ArrayList,添加一些学生对象，并进行遍历。学生类的属性为：姓名和年龄。
        // 要求：对象的数据来自键盘输入
        // 1、创建集合，在未添加元素之前，容量为0；一旦添加一个元素，容量变为10；
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //2、循环输入
        for(int i  = 0; i < 3; i++)
        {
            System.out.print("请输入学生姓名:");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();
            Student stu = new Student();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
        // 2、遍历输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println("学生姓名：" + list.get(i).getName() + " 年龄：" + list.get(i).getAge());
        }
    }
}
