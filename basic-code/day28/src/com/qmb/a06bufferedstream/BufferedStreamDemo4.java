package com.qmb.a06bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         *    字符缓冲输出流
         *      构造方法：
         *           public BufferedWriter(Writer r)
         *      特有方法：
         *           public void newLine()      跨平台的换行
         *
         * */
        BufferedWriter bw = new BufferedWriter(new FileWriter("day28/h.txt",true));
        bw.newLine();
        bw.close();
    }
}
