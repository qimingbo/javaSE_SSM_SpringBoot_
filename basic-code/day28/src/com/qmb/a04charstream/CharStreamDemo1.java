package com.qmb.a04charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 字节输入流
        // 读取：read()无参
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
        // read()细节：
        // 1.一个一个字节读取，遇到汉字会读取多个字节
        // 2.在读取之后，方法的底层还会进行解码并转成十进制。
        //      最终把这个十进制作为返回值
        //      这个十进制的数据也表示在字符集上的数字
        //      英文：文件里面二进制数据 0110 0001
        //              read方法进行读取，解码并转成十进制97
        //      中文：文件里面的二进制数据 11100110 10110001 10001001
        //              read方法进行读取，解码并转成十进制27721
        FileReader fr = new FileReader("day28/e.txt");
        int read;
        while((read = fr.read()) != -1)
        {
            System.out.println(read);
            System.out.println((char)read);
        }


    }
}
