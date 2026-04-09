package com.qmb.a02bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {
        // try...catch...finally
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("day28/c.txt");
            fos = new FileOutputStream("day28/d.txt");
            int read ;
            while ((read = fis.read()) != -1)
            {
                fos.write(read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
