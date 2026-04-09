package com.qmb.a05reflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        */
        Student s = new Student("小A",23,'女',167.5,"睡觉");
        Teacher t = new Teacher("播妞",10000);
        saveObject(s);
    }

    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day35/result.txt"));
        for (Field field : fields) {
            field.setAccessible(true);
            // 字段名字
            String name = field.getName();
            // 字段值
            Object o = field.get(obj);
            // 写入数据
            bw.write(name + " = " + o);
            bw.newLine();
        }
        bw.close();
    }
}
