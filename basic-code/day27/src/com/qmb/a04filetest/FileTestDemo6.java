package com.qmb.a04filetest;

import java.io.File;
import java.security.Key;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class FileTestDemo6 {
    public static void main(String[] args) {
        /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个
        */
        File file = new File("E:/test");
        HashMap<String, Integer> hm = fileCount(file);
        System.out.println(hm);
    }
    public static HashMap<String,Integer> fileCount(File file)
    {
        File[] files = file.listFiles();
        HashMap<String,Integer> hm = new HashMap<>();
        if(files == null) return hm;
        for (File file1 : files) {
            // 如果是文件
            if(file1.isFile()) {
                String name = file1.getName();
                String[] split = name.split("\\.");
                int len = split.length;
                if (len >= 2) {
                    String key = split[len - 1];
                    if (!hm.containsKey(key)) hm.put(key, 1);
                    else {
                        int num = hm.get(key);
                        num++;
                        hm.put(key, num);
                    }
                }
            }
            //如果是文件夹
            else {
                // 把递归的数据并入目标数据中
                HashMap<String, Integer> hm1 = fileCount(file1);
                Set<Map.Entry<String, Integer>> entries = hm1.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String hm1key = entry.getKey();
                    int hm1value = entry.getValue();
                    if(hm.containsKey(hm1key))
                    {
                        int num = hm.get(hm1key);
                        num += hm1value;
                        hm.put(hm1key,num);
                    }
                    else
                        hm.put(hm1key,1);
                }
            }
        }
        return hm;
    }
}
