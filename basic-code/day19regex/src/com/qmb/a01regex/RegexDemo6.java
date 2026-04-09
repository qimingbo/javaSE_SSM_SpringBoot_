package com.qmb.a01regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) throws IOException {
        /* 需求2
        网络爬虫
        扩展需求2：把连接：https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i中所有的身份证号码都爬取出来。
         */

        // 创建一个URL对象
        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        // 连接上这个网站,保证网路畅通
        URLConnection con = url.openConnection();
        // 创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String  line;
        // 获取正则表达式对象
        String regex = "[1-9]\\{17}";
        Pattern p = Pattern.compile(regex);
        while((line = br.readLine()) != null)
        {
            Matcher m = p.matcher(line);
            while (m.find())
            {
                System.out.println(m.group());
            }
        }
        br.close();
    }
}
