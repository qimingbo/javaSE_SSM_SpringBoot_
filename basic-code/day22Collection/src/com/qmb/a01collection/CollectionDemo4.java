package com.qmb.a01collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        /*
        增强for遍历：
        */
        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        // 2.增强for遍历
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
