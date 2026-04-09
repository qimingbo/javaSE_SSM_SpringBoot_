package com.qmb.a01bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
          演示：字节输出流FileOutputStream
          实现需求：写出一段文字到本地文件中。（暂时不写中文）
          创建对象细节：
            1.参数可以是File对象、路径字符串
            2.如果文件不存在会创建文件，但是父路径要存在，否则会报错
            3.文件的内容会被清空

           写数据细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
                    ‘9’
                    ‘7’
          释放资源:每次使用完流之后都要释放资源
          */
        // 1.创建输出流对象
        FileOutputStream fos = new FileOutputStream("day28/a.txt");
        // 2.写入数据
        fos.write(97);
        // 3.关闭流,释放资源
        fos.close();
    }
}
