package com.qmb.a04treemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        需求1：
            键：整数表示
            id值：字符串表示商品名称
            要求：按照id的升序排列、按照id的降序排列
          */
        // 1.创建集合并添加元素
        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(1,"1111");
        map1.put(2,"2111");
        map1.put(3,"3111");

        // 按照id的升序排列(键是Integer类型，默认是升序)
        System.out.println(map1);

        // 按照id的降序排列
        Map<Integer,String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        map2.put(1,"1111");
        map2.put(2,"2111");
        map2.put(3,"3111");
        System.out.println(map2);
    }
}
