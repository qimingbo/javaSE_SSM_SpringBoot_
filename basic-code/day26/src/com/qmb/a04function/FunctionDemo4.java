package com.qmb.a04function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo4 {
    public static void main(String[] args) {
       /*
        方法引用（引用构造方法）
        格式
                类名::new

        目的：
                创建这个类的对象

        需求：
             集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中

        方法引用的规则：
            1.需要有函数式接口
            2.被引用的方法必须已经存在
            3.被引用方法的形参和返回值，需要跟抽象方法的形参返回值保持一致
            4.被引用方法的功能需要满足当前的需求
       */
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        // 3.Lambda表达式形式
        list.stream().map( s -> new Student(s)).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------");

        // 方法引用
        list.stream().map(Student::new).forEach(System.out::println);

    }
}
