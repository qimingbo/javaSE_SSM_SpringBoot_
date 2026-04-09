package com.qmb.a03reflect;

import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
       /*
       Class类中用于获取成员变量的方法
            Field[] getFields()：                返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()：        返回所有成员变量对象的数组
            Field getField(String name)：        返回单个公共成员变量对象
            Field getDeclaredField(String name)：返回单个成员变量对象

       Field类中用于创建对象的方法
            void set(Object obj, Object value)：赋值
            Object get(Object obj)              获取值
    */
        Class clazz = Class.forName("com.qmb.a03reflect.Student");
        // 1.返回所有公共成员变量对象的数组
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("----------------");
        // 2.返回所有成员变量对象的数组
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
        System.out.println("----------------");
        // 3.返回单个公共成员变量对象
        Field field1 = clazz.getField("gender");
        System.out.println(field1);
        System.out.println("----------------");
        // 4.返回单个成员变量对象
        Field field2 = clazz.getDeclaredField("name");
        System.out.println(field2);

        // 获取权限修饰符
        int modifiers = field2.getModifiers();
        System.out.println(modifiers);
        // 获取变量名字
        String name = field2.getName();
        System.out.println(name);
        // 获取成员变量的数据类型
        Class<?> type = field2.getType();
        System.out.println(type);

        // 5.暴力访问
        Student stu = new Student("张三",20,"男");
        field2.setAccessible(true);
        Object o = field2.get(stu);
        System.out.println(o);
        field2.set(stu,"李四");
        System.out.println(stu);
    }
}
