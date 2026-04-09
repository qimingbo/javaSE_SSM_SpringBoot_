package com.qmb.a05test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestDemo3 {
    public static void main(String[] args) throws IOException {
        /* case1
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
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strArr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        // 3.写入
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < list.size(); i++) {
            if(i == strArr.length - 1)
            {
                fw.write(list.get(i) + "");
            }else{
                fw.write(list.get(i) + "-");
            }
        }
        fr.close();
        fw.close();
    }
}
