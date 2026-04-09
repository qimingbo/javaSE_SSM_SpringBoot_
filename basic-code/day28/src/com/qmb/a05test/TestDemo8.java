package com.qmb.a05test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestDemo8 {
    public static void main(String[] args) throws IOException {
        /*需求：
            将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
        */
        Student s1 = new Student("张三",20,"河南");
        Student s2 = new Student("李四",22,"北京");
        Student s3 = new Student("王五",24,"上海");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("day28/object"));
        ois.writeObject(list);

        ois.close();
    }
}
