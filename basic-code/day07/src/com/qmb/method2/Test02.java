package com.qmb.method2;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(countPrimeNumber());
    }

    // 判断101~200之间有多少个素数(质数)，并输出所有素数。
    public static int countPrimeNumber()
    {
        // count：统计素数的个数
        int count = 0;
        for(int i = 101; i <= 200; i++)
        {
            for(int j = 2; j < i; j++) {
                if (i % j == 0) break;
                if (j == i - 1)
                    count++;
            }
        }
        return count;
    }
}
