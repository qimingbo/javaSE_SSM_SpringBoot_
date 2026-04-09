package com.qmb.a05test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestDemo6Case2 {
    public static void main(String[] args) throws IOException {
            /*
                需求：把《出师表》的文章顺序进行恢复到一个新文件中。
            */
            // 1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("day28/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day28/order_csb.txt"));
        String str = null;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while((str = br.readLine()) != null)
        {
            int key = Integer.parseInt(str.substring(0,1));
            String value = str.substring(2);
            tm.put(key,value);
        }
        // 2.写入数据
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
