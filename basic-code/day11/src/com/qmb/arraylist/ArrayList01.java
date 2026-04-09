package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        // 没有泛型的情况
        List list = new ArrayList();
        list.add("hello");
        list.add(123);  // 不报错！
        String s = (String) list.get(0); // 强制类型转换

        // 有泛型的情况
        // List <String> list = new ArrayList<>();

    }
}
