package com.qmb.a06biginteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
        public BigInteger add(BigIntegerval)加法
        public BigInteger subtract（BigInteger val)减法
        public BigInteger multiply(BigInteger val)乘法
        public BigInteger divide(BigInteger val)除法，获取商
        public BigInteger[] divideAndRemainder(BigInteger val)除法，获取商和余数
        public boolean equals(object x)比较是否相同
        public BigInteger pow（int exponent)次幂
        public BigInteger max/min(BigIntegerval)返回较大值/较小值
        public int intValue(BigInteger val)转为int类型整数，超出范围数据有误
         */
        // 1.加法
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(3);
        System.out.println(bd1.add(bd2));

        // 2.减法
        System.out.println(bd1.subtract(bd2));

        // 3.乘法
        System.out.println(bd1.multiply(bd2));

        // 4.除法
        System.out.println(bd1.divide(bd2));

        // 5.除法，获取商和余数
        BigInteger[] result = bd1.divideAndRemainder(bd2);
        System.out.println("数组长度:" + result.length);
        System.out.println("商:"+ result[0] + "余数:" + result[1]);

        // 6.比较是否相同
        System.out.println(bd1.equals(bd2));

        // 7.次幂
        System.out.println(bd1.pow(3));

        // 8.返回较大值/较小值
        System.out.println(bd1.min(bd2));
        System.out.println(bd1.max(bd2));

        // 9.转为int类型整数，超出范围数据有误
        int num = bd1.intValue();
        System.out.println(num);
    }
}
