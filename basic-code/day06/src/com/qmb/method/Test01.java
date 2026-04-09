package com.qmb.method;

public class Test01 {
    public static void main(String[] args) {
        int[] array  = {1, 2, 3, 4, 5};
        int[] newArray = copyOfRange(array, 0, 3);
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i]);
        }

    }


    /* 定义一个方法copyOfRange(int[] array, int from ,int to)
    将数组array从索引from(包含from)开始，到索引to(不包含to)复制到一个新的数组进行返回
     */
    public static int[] copyOfRange(int[] array, int from, int to) {
        int[] newArray = new int[to - from];
        for (int i = from; i<to ; i++)
        {
            newArray[i] = array[i];
        }
         return newArray;

    }
}
