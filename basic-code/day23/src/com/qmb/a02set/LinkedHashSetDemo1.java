package com.qmb.a02set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        // LinkedHashSet是HashSet的子类，在HashSet的基础上添加了一个双链表结构来记录存取的顺序
        // LinkedHashSet:有序、不重复、无索引

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 20);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
