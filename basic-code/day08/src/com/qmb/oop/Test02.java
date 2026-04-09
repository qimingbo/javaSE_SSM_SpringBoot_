package com.qmb.oop;

public class Test02 {
    public static void main(String[] args) {
        // 结果为false,难度较大，好好理解；
        char[] ch = new char[]{'a','b','c'};
        String s1 = new String(ch);

        String s2 = "abc";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

    }
}
