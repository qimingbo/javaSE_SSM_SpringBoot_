package com.qmb.a09zipstream;

import java.io.*;
import java.util.SortedMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 解压缩流
        // 1.要解压的文件
        File src = new File("E://src.zip");
        // 2.解压目的地
        File des = new File("E://");
        // 3.调用方法
        unzip(src,des);
    }
    public static void unzip(File src,File des) throws IOException {
        // 1.创建解压缩流
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        // 2.获取每一个entry
        ZipEntry entry ;
        while((entry = zis.getNextEntry()) != null)
        {
            // 如果是文件夹，则创建文件夹
            if(entry.isDirectory())
            {
                File file = new File(des,entry.toString());
                file.mkdirs();
            }else{
                // 如果是文件，则拷贝
                File file = new File(des,entry.toString());
                int read;
                FileOutputStream fos = new FileOutputStream(file);
                while ((read = zis.read()) != -1)
                {
                    fos.write(read);
                }
                fos.close();
            }
            zis.closeEntry();

        }
        // 3.关闭流
        zis.close();
    }

}
