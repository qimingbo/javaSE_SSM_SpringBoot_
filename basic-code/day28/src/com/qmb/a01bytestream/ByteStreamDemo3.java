package com.qmb.a01bytestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
       /*  字节输出流的三种写出方法：
           void write(int b)                       一次写一个字节数据
           void write(byte[] b)                    一次写一个字节数组数据
           void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
           参数一：
                数组
           参数二：
                起始索引  0
           参数三：
                个数      3
        */
       File file = new File("day28/b.txt");
       FileOutputStream fos = new FileOutputStream(file);
       byte[] b = {97,98,99,100};
       fos.write(b,1,3);
       fos.close();
    }
}
