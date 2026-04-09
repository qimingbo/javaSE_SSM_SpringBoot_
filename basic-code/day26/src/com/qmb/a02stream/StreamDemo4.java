package com.qmb.a02stream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 数组          public static <T> Stream<T> stream(T[]array)        Arrays工具类中的静态方法
        String[] str = {"张三","李四","王五","赵六","钱七"};
        Arrays.stream(str).forEach(s -> System.out.println(s));
    }
}
