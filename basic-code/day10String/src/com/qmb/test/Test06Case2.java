package com.qmb.test;

import javax.sound.midi.Soundbank;

public class Test06Case2 {
    public static void main(String[] args) {
        /* 需求：给你一个字符串s,由若干单词组成，单词前后用一些空格隔开，
        返回字符串中最后一个单词的长度
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
         "Hello World"  5
        "   fly me   to   the moon  "   4
        "luffy is still joyboy"   6
        * */
        int count = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(count);
    }

    public static int lengthOfLastWord(String s) {
        int i = s.length() -1;
        int count = 0;
        // 去除末尾空格
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        // 统计最后一个单词的长度
        while (i >= 0 && s.charAt(i) != ' ')
        {
            i--;
            count++;
        }
        return count;
    }



}
