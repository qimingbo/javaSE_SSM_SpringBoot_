package com.qmb;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Arrays;

public class UrlResourceDemo {
    public static void main(String[] args) throws IOException {
        Resource r1 = new UrlResource("http:www.baidu.com");
        System.out.println(r1.getFilename());
        System.out.println(r1.getDescription());
        System.out.println(r1.getURL());

        Resource r2 = new UrlResource("file:resource.txt");
        System.out.println(r2.getFilename());
        System.out.println(r2.getDescription());
        System.out.println(r2.getURL());
        InputStreamReader isr = new InputStreamReader(r2.getInputStream());
        char[] read = new char[1024*2];
        int len;
        if ((len = isr.read(read)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print(read[i]);
            }
        }

    }
}
