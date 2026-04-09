package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 字节输入流的循环读取
        // read :表示读取数据，而且是读取一个数据就移动一次指针
        FileInputStream fis = new FileInputStream("day28/b.txt");
        int read;
        while((read = fis.read()) != -1)
        {
            System.out.print((char)read);
        }
        fis.close();
    }
}
