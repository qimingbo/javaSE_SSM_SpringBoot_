package com.qmb.a01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 集合的遍历方式：迭代器遍历、增强for遍历、Lambda表达式遍历
        /*
            Iterator<E> iterator() 获取一个迭代器对象
            boolean hasNext() 判断当前指向的位置是否有元素
            E next()         获取当前指向的元素并移动指针
        */
        // 迭代器遍历,迭代器在java中的类是Iterator,迭代器是集合专用的遍历方式

        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        // 2.创建迭代器对象
        Iterator<String> it1 = coll.iterator();
        // 3.循环遍历
        while (it1.hasNext())
        {
            String str = it1.next();
            System.out.println(str);
        }



    }
}
