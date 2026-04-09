package com.qmb.a01regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*有如下文本，请按照要求爬取数据。
        本地爬虫
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,
        因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
        要求：找出里面所有的JavaXX
         */
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
        String regex = "Java\\d{1,2}";
        // 创建正则表达式对象
        Pattern p1 = Pattern.compile(regex);
        // 创建匹配器对象
        Matcher m1 = p1.matcher(str);
        // 如果有,返回true，在底层记录字串的起始索引和结束索引+1
        while (m1.find())
        {
            // 方法底层会根据find方法记录的索引进行字符串的截取
            // subString(起始索引，结束索引)；包头不包尾
            String str1 = m1.group();
            System.out.println(str1);
        }




        //
        Pattern p = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher m = p.matcher("2025-01-14");
        // m.matches()是将整个区域进行匹配
        // m.find()是尝试查找与该模式匹配的输入序列的下一个子序列。
        if (m.matches()) {
            System.out.println(m.group());
            System.out.println(m.group(1)); // 2025
            System.out.println(m.group(2)); // 01
            System.out.println(m.group(3)); // 14
        }

    }
}
