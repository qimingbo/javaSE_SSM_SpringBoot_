package com.qmb.a04charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // FileWriter底层原理
        // 字符流数据写入分为三种情况
        // 1.缓冲区满 2.手动刷新 3.关闭流
        FileWriter fw = new FileWriter("day28/f.txt",true);
        fw.write(98);
        fw.flush();// 手动刷新
    }
}
