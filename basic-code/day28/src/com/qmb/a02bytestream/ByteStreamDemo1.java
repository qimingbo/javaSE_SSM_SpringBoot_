package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 演示：字节输入流FileInputStream
         * 实现需求：读取文件中的数据。（暂时不写中文）
         *
         * 实现步骤：
         *       创建对象
         *       读取数据
         *       释放资源
         * */
        FileInputStream fis = new FileInputStream("day28/a.txt");
        int b1 = fis.read();
        System.out.println((char)b1);//a
        int b2 = fis.read();
        System.out.println((char)b2);//b
        int b3 = fis.read();
        System.out.println((char)b3);//c
        int b4 = fis.read();
        System.out.println((char)b4);//d
        int b5 = fis.read();
        System.out.println(b5);//-1
        fis.close();

    }
}
