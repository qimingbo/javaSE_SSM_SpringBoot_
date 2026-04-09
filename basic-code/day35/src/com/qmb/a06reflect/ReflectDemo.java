package com.qmb.a06reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
         /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
         */
        //1.读取配置文件中的信息
        Properties prop = new Properties();
        prop.load(new FileInputStream("day35/prop.Properties"));
        //2.获取全类名和方法名
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");
        // 3.利用反射创建对象并运行方法
        Class clazz = Class.forName(classname);
        //获取构造方法,并创建对象
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();
        // 获取成员方法并运行
        Method declaredMethod = clazz.getDeclaredMethod(method);
        declaredMethod.invoke(obj);


    }
}
