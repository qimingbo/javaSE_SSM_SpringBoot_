package com.qmb.a02List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {
    public static void main(String[] args) {
        // LinkedList的遍历，用列表特有的方式
        // 1.创建集合并添加元素
        List<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // 2.列表迭代器遍历
        ListIterator<String> lr = list.listIterator();
        while (lr.hasNext())
        {
            String next = lr.next();
            System.out.println(next);
        }
        System.out.println("----------------------");
        // 3.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
