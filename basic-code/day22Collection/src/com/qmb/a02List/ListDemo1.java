package com.qmb.a02List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        /*
            List集合中特有的方法
            void add(int index, E element)  在集合的指定位置插入指定的元素
            E remove(int index)             删除指定索引处的元素,并返回删除的元素
            E set(int index,E element)      修改指定索引处的元素,返回被修改的元素
            E get(int index)                获取指定索引处的元素

        */
        // 1.创建List集合
        List<String> list = new ArrayList<>();
        // 2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //  void add(int index, E element)  在集合的指定位置插入指定的元素
        // 细节:当前索引位置的元素会向后移动一位
        list.add(1,"QQQ");
        System.out.println(list);

        //  E set(int index,E element)      修改指定索引处的元素,返回被修改的元素
        String str = list.set(1,"ddd");
        System.out.println(str);
        System.out.println(list);

        // E get(int index)                获取指定索引处的元素
        String s = list.get(0);
        System.out.println(s);
    }
}
