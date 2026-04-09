package com.qmb.string;

public class StringDemo11 {
    public static void main(String[] args) {
        // 练习7 敏感词替换
        // 1、定义字符串
        String str = "打的很好,cnm,我qnm";
        // 2、定义敏感词数组
        String[] word = {"sb", "cnmd", "cnm", "qnm"};
        // 3、循环数组每一个敏感词，依次进行替换
        for (int i = 0; i < word.length; i++) {
            str = str.replace(word[i], "***");
        }
        System.out.println(str);
    }
}
