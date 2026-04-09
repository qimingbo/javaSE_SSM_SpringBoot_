package studentsystempro;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String str = generateVeriCode();
        System.out.println(str);
    }


    public static String generateVeriCode()
    {
        // 创建52个大小写字母字符
        char[] chs = new char[52];
        for (int i = 0; i < 52; i++) {
            if(i < 26)
                chs[i] = (char)('A' + i);
            else
                chs[i] = (char) ('a' + i - 26);
        }
        // 定义字符数组来存储验证码
        char[] ch = new char[5];
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int randIndex = rd.nextInt(52);
            ch[i] = chs[randIndex];
        }
        ch[4] = (char)('0' + rd.nextInt(10));
        // 打乱
        for (int i = 0; i < ch.length; i++) {
            int randIndex = rd.nextInt(5);
            char temp = ch[i];
            ch[i] = ch[randIndex];
            ch[randIndex] = temp;
        }
        return new String(ch);
    }
}
