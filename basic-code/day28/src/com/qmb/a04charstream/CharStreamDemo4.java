package com.qmb.a04charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // FileReader底层原理,详细看笔记
        FileReader fr = new FileReader("day28/f.txt");
        for (int i = 0; i < 8192; i++) {
            fr.read();
        }

        fr.read();
    }
}
