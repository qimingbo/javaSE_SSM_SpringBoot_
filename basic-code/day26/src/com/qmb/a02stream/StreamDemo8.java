package com.qmb.a02stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
         /*
            map                 转换流中的数据类型

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
        list.stream().map(new Function<String, Integer>() {
            @Override
            // s是流中的数据
            // 返回值:目标数据
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------");
        // 简化形式
        list.stream()
                .map( s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
