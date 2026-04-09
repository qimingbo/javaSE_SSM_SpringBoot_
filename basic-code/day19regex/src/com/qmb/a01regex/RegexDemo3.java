package com.qmb.a01regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        // 正则表达式练习1
        /*需求
        请编写正则表达式验证用户输入的手机号码是否满足要求。
        请编写正则表达式验证用户输入的电话号码是否满足要求。
        请编写正则表达式验证用户输入的邮箱号是否满足要求。
        验证手机号码 13112345678 13712345667 13945679027 139456790271
        验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
         */
        // 1.验证用户输入的手机号码是否满足要求
        //
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("13712345667".matches(regex1));
        System.out.println("13945679027".matches(regex1));
        System.out.println("139456790271".matches(regex1));
        System.out.println("------------------------------");

        // 2.验证用户输入的电话号码是否满足要求。
        String regex2 = "0\\d{2,3}-?\\d{4,7}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));
        System.out.println("------------------------------");

        // 3.验证用户输入的邮箱号是否满足要求
        // 首先分为@前后
        // 再把.com看做一个整体，用小括号括起来
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3})+";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));
        System.out.println("------------------------------");

        // 使用any-rule插件生成的正则表达式,但需要改动一下
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";


        // 自己练习的,java层面的转移 + 正则表达式层面的转移，所以是4个\\\\匹配一个\
        String str = "a\\b\\c";
        String[] str1 = str.split("\\\\");
        System.out.println(1);
    }
}
