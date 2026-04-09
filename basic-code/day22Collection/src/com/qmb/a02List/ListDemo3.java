package com.qmb.a02List;

import java.util.*;

public class ListDemo3 {
    public static void main(String[] args) {
        // List集合的5中遍历方式
        // 迭代器遍历、增强for遍历、Lambad表达式、列表迭代器遍历、for循环遍历
        // 后两种为列表所特有的

        // 创建List集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 1.迭代器遍历
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext())
        {
            String str1 = it1.next();
            System.out.println(str1);
        }
        System.out.println("---------------------");

        // 2.增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // 3.Lambda表达式
        list.forEach(s -> System.out.println(s));
        System.out.println("---------------------");

        // 4.列表迭代器遍历
        ListIterator<String> lr = list.listIterator();
        // 先前向遍历
        while (lr.hasNext())
        {
            String next = lr.next();
            System.out.println(next);
        }
        // 必须先前向遍历完再后向遍历
        while (lr.hasPrevious())
        {

            String previous = lr.previous();
            System.out.println(previous);
        }
        System.out.println("---------------------");

        // 5.for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
