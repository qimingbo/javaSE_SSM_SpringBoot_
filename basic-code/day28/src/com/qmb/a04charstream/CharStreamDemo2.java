package com.qmb.a04charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 读取：read()有参
         /*
            第一步：创建对象
            public FileReader(File file)        创建字符输入流关联本地文件
            public FileReader(String pathname)  创建字符输入流关联本地文件

            第二步：读取数据
            public int read()                   读取数据，读到末尾返回-1
            public int read(char[] buffer)      读取多个数据，读到末尾返回-1

            第三步：释放资源
            public void close()                 释放资源/关流
        */
         // read(chs) 细节：读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
        //  空参的read + 强转类型转换
        FileReader fr = new FileReader("day28/e.txt");
        char[] chs = new char[2];
        int len;
        while ((len = fr.read(chs)) != -1)
        {
            System.out.println(new String(chs,0,len));
        }
    }
}
