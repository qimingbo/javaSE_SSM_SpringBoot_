package com.qmb.a05test;

import java.io.*;

public class TestDemo1 {
    public static void main(String[] args) throws IOException {
        copyDir(new File("E://src"),new File("E://des"));
    }
    public static void copyDir(File src, File des) throws IOException {
        // 需求:拷贝一个文件夹，考虑子文件夹
        des.mkdir();
        // 定义字节数组
        byte[] bytes = new  byte[1024*1024*4];
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()) {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(new File(des,file.getName()));
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fis.close();
                fos.close();
            }
            else
            {
                copyDir(file,new File(des,file.getName()));
            }
            }
    }
}
