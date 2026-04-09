package com.qmb.a03file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
         获取
        public long length()                返回文件的大小（字节数量）
        public String getAbsolutePath()     返回文件的绝对路径
        public String getPath()             返回定义文件时使用的路径
        public String getName()             返回文件的名称，带后缀
        public long lastModified()          返回文件的最后修改时间（时间毫秒值）
     */
/*        // 获取工作目录的两种方式
        // 方式1
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        // 方式2
        File directory = new File("");
        String courseDir = directory.getAbsolutePath();
        System.out.println("工作目录: " + courseDir);*/

        // 1.返回文件的大小（字节数量）
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M，G，可以不断的除以1024
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。
        File file1 = new File("day27/a.txt");// 相对路径
        long length = file1.length();
        System.out.println(length);//13
        File file2 = new File("E:\\develop\\basic-code\\day27");
        System.out.println(file2.length());// 0
        System.out.println("--------------------------");
        // 2.返回文件的绝对路径
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println("--------------------------");
        // 3.返回定义文件时使用的路径
        String path1 = file1.getPath();
        System.out.println(path1);
        String path2 = file2.getPath();
        System.out.println(path2);
        System.out.println("--------------------------");
        // 4.返回文件的名称，带后缀
        //细节1：
        //a.txt:
        //      a 文件名
        //      txt 后缀名、扩展名
        //细节2：
        //文件夹：返回的就是文件夹的名字
        String name1 = file1.getName();
        System.out.println(name1);
        String name2 = file2.getName();
        System.out.println(name2);
        System.out.println("--------------------------");
        // 5.返回文件的最后修改时间（时间毫秒值）
        long time = file1.lastModified();
        System.out.println(time/1000/60/60/24/365);
    }
}
