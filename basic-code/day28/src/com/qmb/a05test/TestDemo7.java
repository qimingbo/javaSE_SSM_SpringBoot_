package com.qmb.a05test;

import java.io.*;

public class TestDemo7 {
    public static void main(String[] args) throws IOException {
            /*
                实现一个验证程序运行次数的小程序，要求如下：
                1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
                2.程序运行演示如下:
                    第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
                    第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
                    第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
                    第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~

           */

            // 1.读取数据
            //原则：
            //IO：随用随创建
            //    什么时候不用什么时候关闭
            BufferedReader br = new BufferedReader(new FileReader("day28/count.txt"));
            String s = br.readLine();
            br.close();
            int count = Integer.parseInt(s);
            count++;
            // 2.判断
            if(count > 3) System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
            else System.out.println("欢迎使用本软件,第" + count + "次使用免费~");
            // 3.写入
            BufferedWriter bw = new BufferedWriter(new FileWriter("day28/count.txt"));
            bw.write(count + "");
            bw.close();
    }
}
