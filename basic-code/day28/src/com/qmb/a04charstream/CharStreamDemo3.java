package com.qmb.a04charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 字符输出流
        /*
            第一步：创建对象
                public FileWriter(File file)                            创建字符输出流关联本地文件
                public FileWriter(String pathname)                      创建字符输出流关联本地文件
                public FileWriter(File file,  boolean append)           创建字符输出流关联本地文件，续写
                public FileWriter(String pathname,  boolean append)     创建字符输出流关联本地文件，续写

            第二步：写入数据
                void write(int c)                           写出一个字符
           常用 void write(String str)                      写出一个字符串
                void write(String str, int off, int len)    写出一个字符串的一部分
                void write(char[] cbuf)                     写出一个字符数组
                void write(char[] cbuf, int off, int len)   写出字符数组的一部分

            第三步：释放资源
                public void close()                 释放资源/关流

                '我'    25105
        */
        FileWriter fw = new FileWriter("day28/e.txt",true);
        char[] chs = {'a','b','c'};
        fw.write(25105);
        fw.write("齐");
        fw.write(chs);
        fw.close();
    }
}
