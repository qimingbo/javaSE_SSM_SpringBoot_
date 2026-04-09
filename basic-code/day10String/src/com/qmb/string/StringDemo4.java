package com.qmb.string;

public class StringDemo4 {
    public static void main(String[] args) {
        // 遍历字符串
        // 字符串也有索引下标，长度数length(),数组长度是length，前者是方法，后者是属性。
        String s1 = "abc";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
