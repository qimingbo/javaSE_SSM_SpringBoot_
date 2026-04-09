package com.qmb.a01regex;

public class RegexDemo11 {
    public static void main(String[] args) {
        // 需求1:判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        // 举例 a123a b456b 17891 &abc& a123b(false)
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("-----------------------");

        // 需求2: 判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        // abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("-----------------------");

        // 需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        // aaa123aaa bbb456bbb 111789111 &&abc&&
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("&abc&".matches(regex3));
        System.out.println("bbb456bba".matches(regex3));
        System.out.println("-----------------------");

        // 需求: 将字符串:我要学学编编编编程程程程程 替换为: 我要学编程
        String  str = "我要学学编编编编程程程程程";
        String regex4 = "(.)\\1+";
        String result = str.replaceAll(regex4,"$1");
        System.out.println(result);
    }
}
