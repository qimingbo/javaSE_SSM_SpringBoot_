package com.qmb.a01map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        // Map的第二种遍历方式：通过键值对对象

        HashMap<String,String> map = new HashMap<>();
        map.put("张三", "黄蓉");
        map.put("李四","木健平");
        map.put("王五","小龙女");

        // 获取"键值对"对象集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 迭代器遍历
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext())
        {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------------------");
        // 增强for遍历
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println("-------------------------");
        // Lambda表达式，先写成匿名内部类形式
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> entry) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("-------------------------");
        // Lambda表达式
        entries.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
