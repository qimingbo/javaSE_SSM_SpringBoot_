package com.qmb.a02stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        // Stream流中的中间方法:
        /*
            filter              过滤
            limit               获取前几个元素
            skip                跳过前几个元素

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list.stream().filter(new Predicate<String>() {
            @Override
            // s是流中的字符串
            // 过滤张开头的
            // 返回true  留下当前数据
            // 返回false 当前数据舍弃不要
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("----------------------");
        // 简化形式
        list.stream()
                .filter( s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));
        System.out.println("----------------------");

        list.stream()
                .limit(3)
                .skip(2)
                .forEach(s -> System.out.println(s));
    }
}
