package com.qmb.a06convertstream;

import java.io.*;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
        */
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day28/gbkfile.txt"),"gbk");
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream("day28/utf-8file.txt"),"utf-8");
        int read;
        while((read = isr.read()) != -1)
        {
            isw.write(read);
        }
        isr.close();
        isw.close();
    }
}
