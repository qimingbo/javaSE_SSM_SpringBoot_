package com.qmb.a03file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象

        E:\develop\basic-code\day27\a.txt
    */
        // 1.根据文件路径创建文件对象
        String pathname = "E:/develop/basic-code/day27/a.txt";
        File file1 = new File(pathname);
        System.out.println(file1);

        // 2.根据父路径名字符串和子路径名字符串创建文件对象
        String parent = "E:/develop/basic-code/day27";
        String child = "a.txt";
        File file2 = new File(parent, child);
        System.out.println(file2);

        // 3.根据父路径对应文件对象和子路径名字符串创建文件对象
        File file3 = new File(parent);
        File file4 = new File(file3,child);
        System.out.println(file4);
    }
}
