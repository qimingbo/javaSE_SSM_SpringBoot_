package com.qmb.a01collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        顶层接口Collection定义的方法：
        public boolean add(E e) 添加
        public void clear()     清空
        public boolean remove(E e)移除元素
        public bolean container(Object obj) 判断是否包含元素
        public boolean isEmpty() 判断是否为空
        public int size() 集合长度
         */
        Collection<String> coll = new ArrayList<>();
        // 1.添加元素
        // 细节1：如果我们要往List系列的集合里添加数据,那么永远返回true,因为List中允许元素重复.
        // 细节2：如果我们要往Set系列的集合里添加数据,如果当前元素不存在，方法返回true.如果存在,方法返回false.因为Set系列的集合是不允许重复的.
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        // 2.清空元素
        //coll.clear();
        //System.out.println(coll);

        // 3.移除元素
        // 细节1：因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素进行删除。
        // 细节2：方法会有一个布尔类型的返回值，删除成功返回true,删除失败返回false
        //       如果要删除的元素不存在，就会删除失败。
        coll.remove("aaa");

        // 4.判断包含元素
        // 细节：底层是依赖equals方法进行判断是否存在。
        // 所以,如果集合中是添加的自定义对象,也想通过contains方法来判断是否包含,那么在javabean类中,一定要重写equals方法.
        boolean result = coll.contains("bbb");
        System.out.println(result);

        // 5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        // 6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }
}
