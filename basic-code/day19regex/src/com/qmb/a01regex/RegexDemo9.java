package com.qmb.a01regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        /*
        贪婪爬取：在爬取数据的时候尽可能多的获取
        非贪婪爬取：在爬取数据的时候尽可能少的获取
         ab+
         贪婪爬取：abbbbbbbbbbb
         非贪婪爬取：ab

         Java中默认的是贪婪爬取,如果在数量词后加？就是非贪婪爬取。
         */
        String text = "Java自从95年问世以来，abbbbbbbbbbbaaaaaaaaaaaaaaaa" +
                "经历了很多版本，目前企业中用的最多的是Java8利Java11,因为这两个是长期支持版本，下一个长期支持版本Java17,相信在未来不不Java17也会逐渐登上历史舞台";

        String regex1 = "ab+";
        String regex2 = "ab+?";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(text);
        while(m1.find()){
            System.out.println(m1.group());
        }

    }
}
