package com.qmb.a03charset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
       /*
           字节流读取中文会出现乱码
           结论：
           1.不要用字节流读取文本文件
           2. 编码解码使用同一个码表，同一种编码方式
        */
        FileInputStream fis = new FileInputStream("day28/c.txt");
        int i;
        while ( (i = fis.read()) != -1)
        {
            System.out.println((char) i);
        }
        fis.close();
    }
}
