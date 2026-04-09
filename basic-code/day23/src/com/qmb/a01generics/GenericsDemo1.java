package com.qmb.a01generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        // 没有泛型的时候,集合是如何存储数据的
        // 结论：
        // 如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        // 此时可以往集合添加任意的数据类型。
        // 带来一个坏处：我们在获取数据的时候，无法使用他的特有行为。

        // 创建集合并添加元素
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("abc");
        list.add(new Student("zhangsan", 20));

        // 遍历集合
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            // 多态的弊端是不能调用子类特有的方法
            // 当我们获取元素并调用方法时，需要转为特定的类型
            String next = (String) it.next();
            next.length();
            System.out.println(next);
        }
    }
}
