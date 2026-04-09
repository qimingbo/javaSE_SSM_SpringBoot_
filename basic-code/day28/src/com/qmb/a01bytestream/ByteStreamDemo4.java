package com.qmb.a01bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 追加写
        FileOutputStream fos  = new FileOutputStream("day28/a.txt",true);
        byte[] b = {99,100};
        fos.write(b);
        fos.close();
    }
}
