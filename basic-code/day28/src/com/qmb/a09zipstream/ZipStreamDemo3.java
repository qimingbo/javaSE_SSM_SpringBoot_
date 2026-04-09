package com.qmb.a09zipstream;

import java.io.*;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 压缩文件夹
        // 1.创建File对象表示要压缩的文件夹
        File src = new File("E://des");
        // 2.创建File对象表示压缩包放在哪里（压缩包的父级路径）
        File destParent = src.getParentFile();
        //3.创建File对象表示压缩包的路径
        File des = new File(destParent,src.getName() + ".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(des));
        //5.获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        tozip(src,zos,src.getName());
        //6.释放资源
        zos.close();
    }
    // 参数三：压缩包内部的路径
    public static void tozip(File src, ZipOutputStream zos,String name) throws IOException {
        // .获取文件夹中的每一个路径,转换后添加到zos中,最后拷贝文件
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isDirectory())
            {
                tozip(file,zos,name+ "/" + file.getName());
            }else {
                zos.putNextEntry(new ZipEntry(name + "/" + file.getName()));
                FileInputStream fis = new FileInputStream(file);
                int read;
                while ((read = fis.read()) != -1)
                {
                    zos.write(read);
                }
                fis.close();
                zos.closeEntry();
            }
        }
    }
    }

