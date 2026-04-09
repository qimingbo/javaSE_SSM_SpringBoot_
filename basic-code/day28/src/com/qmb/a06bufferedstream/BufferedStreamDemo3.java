package com.qmb.a06bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         *   字符缓冲输入流：
         *      构造方法：
         *           public BufferedReader(Reader r)
         *      特有方法：
         *           public String readLine()   读一整行
         *
         * */
        BufferedReader br = new BufferedReader(new FileReader("day28/h.txt"));
        String s = null;
        while((s = br.readLine()) != null)
        {
            System.out.println(s);
        }
    }
}
