package com.qmb.a06biginteger;

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
         public BigInteger(int num, Random rnd) 获取随机大整数，范围[0~2的num次方-1]
         public BigInteger(String val) 获取指定的大整数
         public BigInteger(String val, int radix) 获取指定进制的大整数
         public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象,内部有优化。
         细节：对象一旦创建里面的数据不能发生改变
         */
        // 1.获取一个随机大整数
        Random rd = new Random();
        BigInteger bd1 = new BigInteger(4, rd);
        System.out.println(bd1);

        // 2.获取一个指定的大整数
        // 注意:字符串中的数字必须是整数,否则会报错
        BigInteger bd2 = new BigInteger("123");
        System.out.println(bd2);

        // 3.获取指定进制的大整数
        // 注意：字符串中的数字必须是整数，字符串中的数字要与进制符合.
        BigInteger bd3 = new BigInteger("1111", 2);
        System.out.println(bd3);

        // 4.静态方法获取BigInteger的对象,内部有优化。
        // 细节:1.只能获取long取值范围内的大整数，超出就会报错。
        // 2.在内部对常用数字:-16~16进行优化,提前把-16~16创建好BigInteger对象,如果多次获取不会重新创建新的对象.
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);

        BigInteger bd5 = BigInteger.valueOf(-16);
        BigInteger bd6 = BigInteger.valueOf(-16);
        System.out.println(bd5 == bd6);//true

        BigInteger bd7 = BigInteger.valueOf(-17);
        BigInteger bd8 = BigInteger.valueOf(-17);
        System.out.println(bd7 == bd8);//false

        // 5.对象一旦创建里面的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        bd9 = bd9.add(bd10);// 创建一个新的空间来存储结果
        System.out.println(bd9);

        // 小结：
        // 如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取
        // 如果BigInteger表示的超出long的范围，可以用构造方法获取。
        // 对象一旦创建里面的数据不能发生改变
        // 只要进行计算都会产生一个新的BigInteger对象

    }
}
