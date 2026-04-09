package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
            练习：
                文件拷贝
                把E:/2026newyear.mp4拷贝到当前模块下。

            注意：
                选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。

            课堂练习：
                要求统计一下拷贝时间，单位毫秒
          */
        // 1.分别创建读写两个对象
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:/2026newyear.mp4");
        FileOutputStream fos = new FileOutputStream("day28/aaa.mp4");
        int read;
        // 2.循环读写
        while ((read = fis.read()) != -1)
        {
            fos.write(read);
        }
        // 3.关闭资源
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("消耗时间:"+ (end-start));


    }
}
