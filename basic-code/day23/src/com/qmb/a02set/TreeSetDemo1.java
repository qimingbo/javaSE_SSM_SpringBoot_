package com.qmb.a02set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        需求：利用TreeSet存储整数并进行排序
         */
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.println(ts.add(5));
        System.out.println(ts.add(10));
        System.out.println(ts.add(8));
        System.out.println(ts.add(15));
        System.out.println(ts.add(23));
        System.out.println(ts.add(2));
        System.out.println(ts.add(5));

        System.out.println(ts);
    }


}
