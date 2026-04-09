package com.qmb.a02set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建TreeSet集合，并添加3个学生对象
        学生对象属性：姓名，年龄
        要求按照学生的年龄进行排序
        同年龄按照姓名字母排列（暂不考虑中文）
        同姓名，同年龄认为是同一个人

        方式一：
            默认排序/自然排序：javabean类实现Comparable接口指定比较规则
        方式二:
            比较器排序；创建TreeSet对象的时候,传递比较器Comparator指定规则
        使用原则:默认使用第一种,如果第一种不能满足当前需求,就使用第二种
         */
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);
        // 1.创建TreeSet集合
        TreeSet<Student> ts = new TreeSet<>();
        // 2.添加元素
        System.out.println(ts.add(s3));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s4));
        // 3.打印
        System.out.println(ts);

    }
}
