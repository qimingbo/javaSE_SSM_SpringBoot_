package com.qmb.a01map;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        // Map的三种遍历方式：Lambda表达式
        HashMap<String, String> map = new HashMap<>();
        map.put("张三", "黄蓉");
        map.put("李四", "木健平");
        map.put("王五", "小龙女");
        // 匿名内部类形式
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("-------------------------");
        // Lambda表达式
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
