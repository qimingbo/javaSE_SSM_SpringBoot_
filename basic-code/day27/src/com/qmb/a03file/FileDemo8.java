package com.qmb.a03file;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        /*
        （掌握）public File[] listFiles()                获取当前该路径下所有内容

         */
        File file = new File("E:/develop/basic-code");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
