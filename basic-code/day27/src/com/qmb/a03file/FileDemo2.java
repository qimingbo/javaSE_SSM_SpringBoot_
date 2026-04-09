package com.qmb.a03file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
       /* 判断
        public boolean isDirectory()        判断此路径名表示的File是否为文件夹
        public boolean isFile()             判断此路径名表示的File是否为文件
        public boolean exists()             判断此路径名表示的File是否存在
     */
       // 1.对已存在文件进行判断
        File file1 = new File("E:/develop/basic-code/day27/a.txt");
        System.out.println(file1.isDirectory());// false
        System.out.println(file1.isFile());// true
        System.out.println(file1.exists());// true
        System.out.println("-----------------------------");
        // 2.对已存在目录进行判断
        File file2 = new File("E:/develop/basic-code/day27");
        System.out.println(file2.isDirectory());// true
        System.out.println(file2.isFile());// false
        System.out.println(file2.exists());// true
        System.out.println("------------------------------");
        // 3.对不存在路径进行判断
        File file3 = new File("E:/develop/basic-code/day27/aaa");
        System.out.println(file3.isDirectory());// false
        System.out.println(file3.isFile());// false
        System.out.println(file3.exists());// false
    }
}