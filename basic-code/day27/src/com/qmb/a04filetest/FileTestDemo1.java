package com.qmb.a04filetest;

import java.io.File;
import java.io.IOException;

public class FileTestDemo1 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件
        // 1.创建a.txt的父级目录
        File file = new File("day27/aaa");
        file.mkdirs();
        // 2.拼接父级路径和文件名
        File src = new File(file,"a.txt");
        boolean b = src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else
        {
            System.out.println("创建失败");
        }

    }
}
