package com.qmb.a06convertstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
         /*
            利用转换流按照指定字符编码读取(了解)

            因为JDK11：这种方式被淘汰了。替代方案(掌握)
            day28/gbkfile.txt
        */
         // 方案1(因为JDK11：这种方式被淘汰了)
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("day28/gbkfile.txt"),"GBK");
        int read;
        while((read = isr.read()) != -1)
        System.out.print((char)read);*/

        // 方案2
        FileReader fr = new FileReader("day28/gbkfile.txt", Charset.forName("gbk"));
        int read;
        while((read = fr.read()) != -1)
        {
            System.out.print((char)read);
        }
        fr.close();
    }
}
