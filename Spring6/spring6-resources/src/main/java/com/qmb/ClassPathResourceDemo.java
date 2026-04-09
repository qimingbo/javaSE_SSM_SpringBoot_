package com.qmb;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;

public class ClassPathResourceDemo {
    public static void main(String[] args) throws IOException {
        Resource r1 = new ClassPathResource("qmb.txt");
        System.out.println(r1.getFilename());
        System.out.println(r1.getDescription());
        System.out.println(r1.getURL());

        InputStreamReader isr = new InputStreamReader(r1.getInputStream());
        char[] read = new char[1024*2];
        int len;
        if ((len = isr.read(read)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print(read[i]);
            }
        }
    }
}
