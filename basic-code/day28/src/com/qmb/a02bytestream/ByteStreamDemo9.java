package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo9 {
    public static void main(String[] args) throws FileNotFoundException {
        // JDK9版本
        FileInputStream fis = new FileInputStream("day28/c.txt");
        FileOutputStream fos = new FileOutputStream("day28/d.txt");
        try (fis;fos)
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
