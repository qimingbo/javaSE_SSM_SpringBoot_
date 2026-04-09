package com.qmb.a01generics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        // 使用定义的泛型类MyArrayList
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);


        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}
