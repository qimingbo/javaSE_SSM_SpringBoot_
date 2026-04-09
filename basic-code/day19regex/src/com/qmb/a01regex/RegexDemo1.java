package com.qmb.a01regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*
         假如现在要求校验一个qq号码是否正确。
         规则：6位及20位之内，
         0不能在开头，必须全部是数字。
         先使用目前所学知识完成校验需求
         然后体验一下正则表达式检验。
         */
        String qq = "123456";
        System.out.println(checkQQ(qq));

    }


    public static boolean checkQQ(String qq){
        int len = qq.length();
        if(len < 6 || len > 20) return false;
        if(qq.charAt(0) == '0') return false;
        for (int i = 0; i < len; i++) {
            if(qq.charAt(i) < '0' || qq.charAt(i) > '9') return false;
        }
        return true;

    }
}
