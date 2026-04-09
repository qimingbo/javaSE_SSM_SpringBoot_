package com.qmb.a01regex;

public class RegexDemo4 {
    public static void main(String[] args) {
        // 正则表达式练习2
       /*
       需求。
       请编写正则表达式验证用户名是否满足要求。
           要求：大小写字母，数字，下划线一共4-16位。
       请编写正则表达式验证身份证号码是否满足要求。
            简单要求：18位，前17位任意数字，最后一位可以是数字也可以是大写或小写的x
            复杂要求：按照身份证号码的格式严格要求。
       */
        // 要求:大小写字母，数字，下划线一共4-16位。
       String regex1 = "\\w{4,16}";
       System.out.println("zhangsan".matches(regex1));
       System.out.println("lisi".matches(regex1));
       System.out.println("&123".matches(regex1));
       System.out.println("------------------------");

        // 2.简单要求：18位，前17位任意数字，最后一位可以是数字也可以是大写或小写的x
        // 41980119930228457X 510881197609822389 15049119818795387X 138133197284939824 430102197606046442
        String regex2 = "[1-9]\\d{16}[0-9xX]";// 或者"[1-9]\\d{16}(\\d|x|X)"
        String regex3 = "[1-9]\\d{16}(\\d|x|X)";
        String regex4 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("41980119930228457X".matches(regex4));
        System.out.println("510881197609822389".matches(regex4));
        System.out.println("15049119818795387X".matches(regex4));
        System.out.println("138133197284939824".matches(regex4));
        System.out.println("430102197606046442".matches(regex4));
        System.out.println("------------------------");
        // 忽略大小写的书写方法,在匹配的时候忽略字母大小写
        String regex5 = "a(?i)bc";
        System.out.println("abc".matches(regex5));
        System.out.println("ABC".matches(regex5));
        System.out.println("aBc".matches(regex5));
        System.out.println("------------------------");

        // 3.复杂要求：按照身份证号码的格式严格要求。
        // 410801 1993 02 28 457x
        // 前面6位：省份 市  县区等信息,第一位不为0,后面5位任意
        // 年的前半段: 18 19 20，年的后半段：任意数字出现两次
        // 月份：01-09 10，11，12
        // 日：01-31
        // 后面4位:任意数字出现3次,最后一位可以是数字或者是大小写x
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}((?i)x|\\d)";
        System.out.println("41080119930228457X".matches(regex6));
        System.out.println("411324200212123215".matches(regex6));
        System.out.println("------------------------");
        String regex7 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}
