package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
       /*
          public int read(byte[] buffer)      一次读一个字节数组数据
          读取的数据放到字节数组中
          一次读取多个字节数据，具体读多少，跟数组的长度有关
          返回值：本次读取到了多少个字节数据
      */
       // 1.创建对象
        FileInputStream fis = new FileInputStream("day28/a.txt");// abcdefg
        // 2.定义字节数组，读取文件
        byte[] bytes = new byte[2];

        int len1 = fis.read(bytes);//2
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);//2
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);//2
        String str3 = new String(bytes,0,len3);
        System.out.println(str3);

        int len4 = fis.read(bytes);//1
        String str4 = new String(bytes,0,len4);
        System.out.println(str4);
        // 3.关闭资源
        fis.close();
    }
}
