package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 字节输入流
        // 创建对象
        //      细节1:如果文件不存在，会报错，不会自动创建文件。
        // 读文件细节:
        //      细节1:一次读一个字节，读出来的是数据在ASCII上对应的数字
        //      细节2:读到文件末尾了，read方法返回-1。

        FileInputStream fis = new FileInputStream("day28/c.txt");
        int read = fis.read();
        fis.close();
        System.out.println(read);
    }
}
