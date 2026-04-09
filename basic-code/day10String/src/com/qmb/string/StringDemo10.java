package com.qmb.string;

import javax.sound.midi.Soundbank;

public class StringDemo10 {
    public static void main(String[] args) {
        // 练习6 身份证号信息查询,总共18位,7-14位是出生年月日,17位是性别 奇数是男 偶数是女。要求输入字符串，输出 出生年月日和性别
        // 1、定义字符串
        String identiCode = "411324200212123239";
        // 2、
        String year = identiCode.substring(6, 10);
        String month = identiCode.substring(10,12);
        String day = identiCode.substring(12, 14);
        char gender = identiCode.charAt(16);
        // '0' -> 48
        // '9' -> 57
        // 将字符数字变为数字
        int genderNum = gender - '0';
        if(genderNum % 2 == 0) gender = '女';
        else
            gender = '男';
        System.out.println("出生年月是：" + year + '年' + month + '月' + day + '日');
        System.out.println("性别是：" + gender);


    }
}
