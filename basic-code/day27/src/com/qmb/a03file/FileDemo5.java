package com.qmb.a03file;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        /*
        public boolean delete()             删除文件、空文件夹
        细节：
            如果删除的是文件，则直接删除，不走回收站。
            如果删除的是空文件夹，则直接删除，不走回收站
            如果删除的是有内容的文件夹，则删除失败
      */

        // 4.删除文件、空文件夹
        File file1 = new File("day27/aaa");
        boolean b1 = file1.delete();
        System.out.println(b1);

        File file2 = new File("day27/bbb");
        boolean b2 = file2.delete();
        System.out.println(b2);

        File file3 = new File("day27/ccc/bbb");
        boolean b3 = file3.delete();
        System.out.println(b3);
    }
}
