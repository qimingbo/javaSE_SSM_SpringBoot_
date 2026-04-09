package com.qmb.a05test;

import java.io.*;

public class TestDemo5 {
    public static void main(String[] args) throws IOException {
        // 统计四种拷贝方式的用时，分别是单个字节读写的字节流、字节数组读写的字节流、单个字节读写的缓冲字节流、字节数组读写的缓冲字节流
        long start = System.currentTimeMillis();
        // 5,577,909byte
        //method1(); //55456ms
        //method2(); // 14ms
        //method3(); // 146ms
        //method4(); // 19ms
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    // 单个字节读写的字节流
    public static  void method1() throws IOException {
        FileInputStream fis =  new FileInputStream("day28/aaa.mp4");
        FileOutputStream fos = new FileOutputStream("day28/bbb.mp4");
        int read;
        while((read = fis.read()) != -1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
    }
    // 字节数组读写的字节流
    public static  void method2() throws IOException {
       FileInputStream fis =  new FileInputStream("day28/aaa.mp4");
       FileOutputStream fos = new FileOutputStream("day28/bbb.mp4");
       int len;
       byte[] bytes = new byte[1024*8];
       while((len = fis.read(bytes)) != -1)
       {
           fos.write(bytes, 0, len);
       }
       fis.close();
       fos.close();
    }
    // 单个字节读写的缓冲字节流
    public static  void method3() throws IOException {
        // 1.创建字节缓存输入流和输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day28/aaa.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day28/bbb.mp4"));
        int read;
        // 2.一个一个字节读取
        while((read = bis.read()) != -1)
        {
            bos.write(read);
        }
        // 3.关闭流
        bis.close();
        bos.close();
    }
    // 字节数组读写的缓冲字节流
    public static  void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day28/aaa.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day28/bbb.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1)
        {
            bos.write(bytes,0, len);
        }
        bis.close();
        bos.close();
    }
}
