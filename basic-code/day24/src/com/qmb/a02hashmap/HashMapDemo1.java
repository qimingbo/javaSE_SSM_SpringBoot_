package com.qmb.a02hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        /*
        需求
            创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
            存储三个键值对元素，并遍历
            要求：同姓名，同年龄认为是同一个学生
         */

        // 1.创建HashMap集合
        Map<Student,String> map = new HashMap<>();

        // 2.创建学生对象
        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("wangwu", 20);

        // 3.添加元素
        map.put(s1,"河南");
        map.put(s2,"北京");
        map.put(s3,"上海");
        map.put(s4,"浙江");

        // 4.遍历集合
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------------------------");


    }
}
