package com.qmb.a06biginteger;

import java.math.BigInteger;

public class BigIntegerDemo3 {
    public static void main(String[] args) {
        // BigInteger的内部是通过符号位存储符号，数值是转化为二进制补码按32位截取存储到一个数组中。
        BigInteger bd1 = new BigInteger("-27670116110564327424");
        System.out.println(bd1);
    }
}
