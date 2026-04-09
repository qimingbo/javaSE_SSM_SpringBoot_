package com.qmb.a04filetest;

import java.io.File;

public class FileTestDemo3 {
    public static void main(String[] args) {
        /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断
        */
        File file = new File("E:\\");
        findAvi(file);
    }

    public static void findAvi(File file)
    {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if(file1.isDirectory()) findAvi(file1);
                else if(file1.getName().endsWith(".avi")){
                    System.out.println(file1);
                }
            }
        }
    }
}
