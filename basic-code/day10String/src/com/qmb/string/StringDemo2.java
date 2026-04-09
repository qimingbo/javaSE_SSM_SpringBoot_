package com.qmb.string;

public class StringDemo2 {
    public static void main(String[] args) {
        // 字符串的比较
        String s1 = "abc";
        String s2 = new String("abc");
        // 等号比较
        System.out.println(s1 == s2);
        // equals比较
        System.out.println(s1.equals(s2));
        // 忽略大小写比较
        String s3 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
