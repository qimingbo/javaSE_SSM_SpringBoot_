package com.qmb.a05test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class TestDemo4 {
    public static void main(String[] args) throws IOException {

        /* case2
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */
        // 1.读取数据
        File file = new File("day28/g.txt");
        FileReader fr = new FileReader(file);
        StringBuilder sb = new StringBuilder();
        int read;
        while((read = fr.read()) != -1)
        {
            sb.append((char) read);
        }
        // 2.排序
        String[] strArr = sb.toString().split("-");
        Integer[] arr = Arrays.stream(strArr)
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        // 3.写入
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        System.out.println(result);
        FileWriter fw = new FileWriter(file);
        fw.write(result);
        fr.close();
        fw.close();
    }
}
