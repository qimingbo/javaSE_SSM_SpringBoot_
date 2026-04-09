package com.qmb.a04treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        /*
        需求2：
        键：学生对象
        值：籍贯
        要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
         */
        // 第一种方式：实现Comparable
        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("wangwu", 19);
        Map<Student,String> map1 = new TreeMap<>();
        map1.put(s1,"河南");
        map1.put(s2,"北京");
        map1.put(s3,"上海");
        map1.put(s4,"浙江");
        System.out.println(map1);
        System.out.println("---------------------------");

        // 第二种方式:Comparator
        Map<Student,String> map2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });
        map2.put(s1,"河南");
        map2.put(s2,"北京");
        map2.put(s3,"上海");
        map2.put(s4,"浙江");
        System.out.println(map2);

    }
}
