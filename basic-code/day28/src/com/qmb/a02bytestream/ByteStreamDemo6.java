package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        // 改进 文件拷贝
        // 使用字节数组

        // 1.分别创建读写两个对象
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:/2026newyear.mp4");
        FileOutputStream fos = new FileOutputStream("day28/aaa.mp4");
        int len;
        byte[] bytes = new byte[1024*1024*4];
        // 2.循环读写
        while ((len = fis.read(bytes)) != -1)
        {
            fos.write(bytes, 0, len);
        }
        // 3.关闭资源
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("消耗时间:"+ (end-start));
    }
}
