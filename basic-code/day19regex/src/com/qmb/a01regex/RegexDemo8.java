package com.qmb.a01regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {
        /*
        有条件的爬取数据
        有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8利Java11,因为这两个是长期支持版本，下一个长期支持版本Java17,相信在未来不不Java17也会逐渐登上历史舞台
        需求1：爬取版本号为8,11,17的Java文本，但是只要Java,不显示版本号。
        需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        需求3：爬取除了版本号为8,11,17的Java文本，
         */

        String text = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8利Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本Java17," +
                "相信在未来不不Java17也会逐渐登上历史舞台";
        // 1.需求1
        String regex1 = "(?i)Java(?=8|11|17)";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(text);
        while (m.find())
        {
            System.out.println(m.group());
        }
        System.out.println("----------------------");

        // 需求2
        String regex2 = "Java(8|11|17)";
        String regex3 = "Java(?:8|11|17)";
        Pattern p1 = Pattern.compile(regex2);
        Matcher m1 = p1.matcher(text);
        while (m1.find()){
            System.out.println(m1.group());
        }
        System.out.println("----------------------");

        // 3.需求3
        String regex4 = "Java(?!8|11|17)";
        Pattern p2 = Pattern.compile(regex4);
        Matcher m2 = p2.matcher(text);
        while (m2.find())
        {
            System.out.println(m2.group());
        }
    }
}
