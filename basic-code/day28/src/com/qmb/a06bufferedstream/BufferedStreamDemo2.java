package com.qmb.a06bufferedstream;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
         *   需求：
         *       利用字节缓冲流拷贝文件,一次读写多个字节
         *
         *   字节缓冲输入流的构造方法：
         *           public BufferedInputStream(InputStream is)
         *
         *    字节缓冲输出流的构造方法：
         *           public BufferedOutputStream(OutputStream os)
         *
         * */
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
