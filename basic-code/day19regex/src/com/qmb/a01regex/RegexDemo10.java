package com.qmb.a01regex;

public class RegexDemo10 {
    public static void main(String[] args) {
        /*
        String类中的方法:
        public String replaceAll(String regex, String newStr) 按照正则表达式的规则进行替换
        public String[] split(String regex) 按照正则表达式的规则进行切割字符串

        有一小段字符串：小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
        要求1:把字符串中的三个名字之间的字母数字替换为vs
        要求2:把字符串的三个姓名切割出来
         */

        // 1.需求1
        String text = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String regex1 = "[\\w&&[^_]]+";
        String str = text.replaceAll(regex1,"vs");
        System.out.println(str);

        // 2.需求2
        String[] strArr = text.split(regex1);
        for(String s : strArr) {
            System.out.println(s);
        }


    }
}
