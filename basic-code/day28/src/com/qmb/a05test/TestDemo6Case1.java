package com.qmb.a05test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDemo6Case1 {
    public static void main(String[] args) throws IOException {
            /*
                需求：把《出师表》的文章顺序进行恢复到一个新文件中。
            */
        // 1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("day28/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day28/order_csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String s = null;
        int i = 0;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        // 2.排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int s1 = Integer.parseInt(o1.substring(0,1));
                int s2 = Integer.parseInt(o2.substring(0,1));
              return  s1 - s2;
            }
        });
        // 3.写入数据
        for (String s1 : list) {
            bw.write(s1);
            bw.newLine();
        }
        br.close();
        bw.close();



    }
}
