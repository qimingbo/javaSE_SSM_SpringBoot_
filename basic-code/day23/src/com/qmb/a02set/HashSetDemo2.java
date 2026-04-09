package com.qmb.a02set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现在控制台遍历该集合。
        要求：学生对象的成员变量值相同，我们就认为是同一个对象
         */
        HashSet<Student> hs1 = new HashSet<>();
        hs1.add(new Student("zhangsan",20));
        hs1.add(new Student("lisi",22));
        hs1.add(new Student("wangwu",24));
        hs1.add(new Student("wangwu",24));
//        System.out.println(hs1);
        Iterator<Student> it = hs1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
