package com.qmb.test;

public class Test06Case1 {
    public static void main(String[] args) {
        /* 需求：给你一个字符串s,由若干单词组成，单词前后用一些空格隔开，
        返回字符串中最后一个单词的长度
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
        "Hello World"  5
        "   fly me   to   the moon  "   4
        "luffy is still joyboy"   6
        * */

        System.out.println(lengthOfLastWord("Hello World"));          // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }



}
