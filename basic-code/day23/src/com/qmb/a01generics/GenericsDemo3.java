package com.qmb.a01generics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
     /*
    泛型方法
    练习：定义一个工具类ListUtil
    类中定义一个静态方法addAll，用来添加多个元素
     */
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "aaa","bbb","ccc","ddd");
        System.out.println(list);


    }
}
