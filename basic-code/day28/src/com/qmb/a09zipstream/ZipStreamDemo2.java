package com.qmb.a09zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 压缩单个文件
        File src = new File("day28/a.txt");
        File des = new File("day28/a.zip");
        tozip(src,des);

    }
    public static void tozip(File src, File des) throws IOException {
        //  1.创建压缩流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(des));
        // 2.创建zipentry对象并添加到压缩流中
        ZipEntry entry = new ZipEntry(src.getName());
        zos.putNextEntry(entry);
        // 3.拷贝到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int read;
        while((read = fis.read()) != -1)
        {
            zos.write(read);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
    
}
