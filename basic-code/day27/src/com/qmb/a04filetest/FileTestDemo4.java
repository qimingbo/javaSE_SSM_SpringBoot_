package com.qmb.a04filetest;

import java.io.File;

public class FileTestDemo4 {
    public static void main(String[] args) {
           /*
               删除一个多级文件夹
               如果我们要删除一个有内容的文件夹
                   1.先删除文件夹里面所有的内容
                   2.再删除自己
            */
        File file = new File("E:/test");
        deleteDirs(file);
    }
    public static void deleteDirs(File file)
    {
        File[] files = file.listFiles();
        if(files == null) return;
        for (File file1 : files) {
            if(file1.isDirectory()) deleteDirs(file1);
            file1.delete();
            System.out.println("删除文件：" + file1);
        }
        file.delete();
    }
}
