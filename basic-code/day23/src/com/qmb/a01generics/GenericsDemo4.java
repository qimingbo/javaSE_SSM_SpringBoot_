package com.qmb.a01generics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
        泛型接口的两种使用方式：
            1.实现类给出具体的类型
            2.实现类延续泛型，创建实现类对象时再确定类型
        */
        // 1.实现类给出具体的类型
        MyArrayList2 list1 = new MyArrayList2();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        System.out.println(list1);

        //2.实现类延续泛型，创建实现类对象时再确定类型
        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list1);

        int a =1;
        int b =3;
    }
}
