package com.qmb.a02static;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        // 1、创建集合来存储学生对象
        List<Student> list = new ArrayList<>();

        // 2、创建三个学生对象
        Student s1 = new Student("zhangsan", "男", 20);
        Student s2 = new Student("lisi", "男", 22);
        Student s3 = new Student("wangwu", "男", 28);

        // 3、添加对象到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 4、调用工具类
        int maxAge = StudentUtil.getMaxAgeSyudent(list);
        System.out.println(maxAge);
    }
}
