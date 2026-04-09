package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) {
        // 自动关闭资源，前提是实现AutoCloseable接口
        // JDK7版本
        try (FileInputStream fis = new FileInputStream("day28/c.txt");
             FileOutputStream fos = new FileOutputStream("day28/d.txt"))
        {
            int read ;
            while ((read = fis.read()) != -1)
            {
                fos.write(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
