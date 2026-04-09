package com.qmb.a03file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
       /*
        public boolean createNewFile()      创建一个新的空的文件
        public boolean mkdir()              创建单级文件夹
        public boolean mkdirs()             创建多级文件夹
        public boolean delete()             删除文件、空文件夹
      */
        //1.createNewFile 创建一个新的空的文件
        //细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        //      如果当前路径表示的文件是存在的，则创建失败，方法返回false
        //细节2：如果父级路径是不存在的，那么方法会有异常IOException
        //细节3：createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        File file1 = new File("day27/aaa");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);

        // 2.创建单级文件夹
        //细节1：windows中,路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        File file2 = new File("day27/bbb");
        boolean b2 = file2.mkdir();
        System.out.println(b2);

        // 3.创建多级文件夹
        File file3 = new File("day27/ccc/bbb");
        boolean b3 = file3.mkdirs();
        System.out.println(b3);


    }
}
