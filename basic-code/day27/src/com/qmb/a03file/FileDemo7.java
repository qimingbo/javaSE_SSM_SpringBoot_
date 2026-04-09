package com.qmb.a03file;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo7 {
    public static void main(String[] args) {
      /*
        public static File[] listRoots()                列出可用的文件系统根
        public String[] list()                          获取当前该路径下所有内容
        public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
        （掌握）public File[] listFiles()                获取当前该路径下所有内容
        public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
        其它的了解一下
      */

      // 1.列出可用的文件系统根 (获取系统中所有的盘符)
        File[] files1 = File.listRoots();
        for (File file : files1) {
            System.out.println(file);
        }
        System.out.println("----------------------");
      // 2.获取当前该路径下所有内容(仅仅能获取名字)
        File file1 = new File("E:/develop");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
      // 3.利用文件名过滤器获取当前该路径下所有内容
        //需求：我现在要获取E:/develop文件夹里面所有的java开头的文件
        String[] file2 = file1.list(new FilenameFilter() {
            //accept方法的形参，依次表示develop文件夹里面每一个文件或者文件夹的路径
            //参数一：父级路径
            //参数二：子级路径
            //返回值：如果返回值为true，就表示当前路径保留
            //        如果返回值为false，就表示当前路径舍弃不要
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);
                return file.isFile() && name.startsWith("java");
            }
        });
        for (String s : file2) {
            System.out.println(s);
        }
    }
}
