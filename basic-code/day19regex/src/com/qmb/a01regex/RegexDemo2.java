package com.qmb.a01regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        // 使用正则表达式来匹配
        // 匹配一个字符
        System.out.println("a".matches("[a-z]"));
        System.out.println("ab".matches("[a-c]"));
        System.out.println("1".matches("[0-9]"));
        System.out.println("a".matches("[^a-x]"));
        System.out.println(".".matches("\\."));
        System.out.println("1".matches("\\D"));
        System.out.println("abcd".matches("[a-z]+"));

        // 补充：split函数有两个参数，一个是分割的正则表达式.另外一个是limit,>0,限制分割的次数;<0,保留末尾空字符串;=0,默认丢弃末尾空字符串
        String[] str1 = "192.168.1.1.".split("\\.",5);
        String[] str2 = "192.168.1.1.".split("\\.",4);
        String[] str3 = "192.168.1.1.".split("\\.",0);
        String[] str4 = "192.168.1.1.".split("\\.",-1);
        String[] str5 = "192.168.1.1".split("\\.",-1);
        System.out.println(1);

    }
}
