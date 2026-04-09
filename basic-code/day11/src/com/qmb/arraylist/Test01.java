package com.qmb.arraylist;

public class Test01 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[] arr1= new int[]{11, 22};
        int[] arr2= {33, 44, 55};
        arr[0] = arr1;
        arr[1] = arr2;
        System.out.println(arr[0][2]);
    }
}
