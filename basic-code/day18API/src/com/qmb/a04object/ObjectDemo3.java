package com.qmb.a04object;

public class ObjectDemo3 {
    public static void main(String[] args) {
        // equal()练习
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));// false
        // 因为equal是s调用的，所以看s的equal方法。
        // 字符串中的equal方法是先判断比较类型是否为字符串类型,如果是,再继续比较字符串。如果不是,直接返回false.
        System.out.println(sb.equals(s));// false
        // StringBuilder中没有重写equal方法，所以直接比较两个对象的地址值是否相等。

    }
}
