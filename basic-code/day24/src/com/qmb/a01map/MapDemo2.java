package com.qmb.a01map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        // Map的第一种遍历方式：通过键找值

        Map<String,String> map = new HashMap<>();
        map.put("张三", "黄蓉");
        map.put("李四","木健平");
        map.put("王五","小龙女");

        // 获取map的键集合，是单列集合
        Set<String> keySet = map.keySet();
        // 迭代器遍历
        Iterator<String> it = keySet.iterator();
        while (it.hasNext())
        {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------------------");
        // 增强for遍历
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------------------");
        // Lambda表达式，先写成匿名内部类形式
        keySet.forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                String value = map.get(key);
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("-------------------------");
        // Lambda表达式
        keySet.forEach(key -> {
                String value = map.get(key);
                System.out.println(key + " = " + value);
        });
    }
}
