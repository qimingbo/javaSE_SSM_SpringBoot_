package com.qmb.a03charset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    public static void main(String[] args) {
        // 字节流拷贝不会乱码
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
