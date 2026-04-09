package com.qmb.a04function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FunctionDemo9 {
    public static void main(String[] args) {
        /*
         *   需求：
         *       创建集合添加学生对象
         *       学生对象属性：name，age
         *   要求：
         *       把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
         *       使用方法引用完成
         * */
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",20));
        list.add(new Student("李四",22));
        list.add(new Student("王五",21));
        String[] strings1 = list.stream().map(s -> s.getName() +"-"+ s.getAge()).toArray(String[]::new);
        String[] strings2 = list.stream().map(Student::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));
    }
}
