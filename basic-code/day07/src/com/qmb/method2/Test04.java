package com.qmb.method2;

public class Test04 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] array = {1, 4, 6, 8, 10};
        //2.调用方法
        int[] newArray = new int[array.length];
        newArray = copyOfArray(array);
        //3.输出新数组
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }


    // 定义一个方法把一个数组复制到另外一个并返回
    public static int[] copyOfArray(int array[])
    {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
