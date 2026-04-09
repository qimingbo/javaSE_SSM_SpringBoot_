package com.qmb.a06bufferedstream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *   需求：
         *       利用字节缓冲流拷贝文件
         *
         *   字节缓冲输入流的构造方法：
         *           public BufferedInputStream(InputStream is)
         *
         *    字节缓冲输出流的构造方法：
         *           public BufferedOutputStream(OutputStream os)
         *
         * */
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
}
