package com.qmb.a06convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定字符编码写出
        */
        // 方案1
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day28/i.txt"),"gbk");
        osw.write("你好");
        osw.close();*/

        // 方案2
        FileWriter fw = new FileWriter("day28/i.txt", Charset.forName("gbk"));
        fw.write("你好呀");
        fw.close();
    }
}
