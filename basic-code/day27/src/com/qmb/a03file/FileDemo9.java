package com.qmb.a03file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo9 {
    public static void main(String[] args) {
        /*
         public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
         public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
         */
        File file = new File("E:/develop");
        // 1.用文件名过滤器获取当前该路径下所有内容
        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.exists() && pathname.getName().startsWith("java");
            }
        });
        for (File f : files1) {
            System.out.println(f);
        }
        // 2.用文件名过滤器获取当前该路径下所有内容
        File[] files2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.exists() && name.startsWith("java");
            }
        });
        for (File f : files2) {
            System.out.println(f);
        }
    }
}
