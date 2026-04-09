package com.qmb.a01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        /*
         迭代器遍历注意的细节
         1.当前指针位置没有元素，强制去获取元素，会报NoSuchElementException
         2.迭代器遍历结束，指针不会复位。若想再次遍历，重新创建迭代器对象
         3.迭代器遍历的时候，只能使用一次next方法
         4.在迭代器遍历的时候，不能用集合的方式进行增加或者删除。可以使用迭代器的方式进行删除
         */
        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");
        // 2.创建迭代器对象
        Iterator<String> it1 = coll.iterator();
        // 3.循环遍历
        while (it1.hasNext())
        {
            String str1 = it1.next();
//            String str2 = it1.next();
            System.out.println(str1);
//            System.out.println(str2);
        }
//        System.out.println(it1.next());
    }
}
