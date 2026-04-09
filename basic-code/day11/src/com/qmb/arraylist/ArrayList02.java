package com.qmb.arraylist;

import jdk.jfr.Description;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        /*
       添加操作：boolean add(E e);
       删除操作：boolean remove(E e);
                E remove(int index)
       修改操作：E set(int index, E e);
       查找操作：E get(int index);
       长度：int size();
         **/
      List<String> list = new ArrayList<>();
      // 1、添加元素
      list.add("aaa");
      list.add("bbb");
      list.add("ccc");
      list.add("ddd");
       // 2、删除元素
//      list.remove(0);
//      list.remove("aaa");
        // 3、修改元素
//        list.set(0, "eee");
        // 4、查找元素
        String str = list.get(0);
        System.out.println(str);
        // 5、长度
        int len = list.size();
        System.out.println(len);
      System.out.println(list);

    }
}
