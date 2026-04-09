package com.qmb.a02reflect;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */
        Class clazz = Class.forName("com.qmb.a02reflect.Student");
        // 1.返回所有公共构造方法对象的数组
        Constructor[] constructors1 = clazz.getConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------");
        // 2.返回所有构造方法对象的数组
        Constructor[] constructors2 = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------");
        // 3.返回单个公共构造方法对象
        Constructor constructor1 = clazz.getConstructor();
        System.out.println(constructor1);
        System.out.println("-----------------------");
        // 4.返回单个构造方法对象
        Constructor constructor2 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2);
        AnnotatedType annotatedReturnType = constructor2.getAnnotatedReturnType();
        System.out.println(annotatedReturnType);
        int modifiers = constructor2.getModifiers();//常量字段值，2 -> private
        System.out.println(modifiers);

        Parameter[] parameters = constructor2.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        // 暴力反射：表示临时取消权限校验
        constructor2.setAccessible(true);
        Object stu = constructor2.newInstance("张三", 20);
        System.out.println(stu);
    }
}
