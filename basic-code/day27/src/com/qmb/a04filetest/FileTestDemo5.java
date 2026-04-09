package com.qmb.a04filetest;

import java.io.File;

public class FileTestDemo5 {
    public static void main(String[] args) {
    /*      需求：
            统计一个文件夹的总大小
      */
    File file = new File("E:/develop");
        long l = dirLength(file);
        System.out.println(l);

    }

    public static long dirLength(File file)
    {
        File[] files = file.listFiles();
        Long len = 0L;
        for (File file1 : files) {
            if(file1.isDirectory()) len += dirLength(file1);
            else len += file1.length();
        }
        return len;
    }
}
