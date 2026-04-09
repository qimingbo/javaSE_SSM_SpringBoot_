package com.qmb.a05test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestDemo9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 多个对象反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day28/object"));
        List<Student> list = (List<Student>) ois.readObject();
        list.forEach(System.out::println);
        ois.close();
    }
}
