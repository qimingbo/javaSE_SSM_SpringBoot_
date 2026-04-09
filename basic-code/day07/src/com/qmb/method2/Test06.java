package com.qmb.method2;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //需求： 双色球由6个红球号码和1个蓝色号码组成，红色号码从1-33选择;蓝色号码从1-16选择;
        // 1、创建中奖号码
        int [] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 2、用户输入
        int[] userInputArray = userInputNumber();
        // 3、统计中奖的红色号码和蓝色号码
        int redCount = 0;
        int blueCount = 0;
        // 找中奖红球的个数
        for (int i = 0; i < userInputArray.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(userInputArray[i] == arr[j])
                {
                    redCount++;
                    break;
                }
            }
        }
        // 中奖蓝球的个数
        if(userInputArray[6] == arr[6]) blueCount++;

        // 4、输出中奖
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你，中奖3000");
        }else if((redCount == 5 && blueCount == 0) ||  (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中奖200");
        }else if((redCount == 4 && blueCount == 0) ||  (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中奖10");
        }else if((redCount == 2 && blueCount == 1) ||  (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }

    // 功能：创建中奖号码
    public static int[] createNumber()
    {
        // 定义中将数组
        int[] arr = new int[7];
        Random rd = new Random();
        // 生成红色中奖号码
        for (int i = 0; i < 6; ) {
            int num = rd.nextInt(1,34);
            // 判断数组中是否包含这个中奖号码，要求是不能重复
            if(!container(arr, num)){
                arr[i] = num;
                i++;
            }
        }
        // 生成蓝色中奖号码
        arr[6] = rd.nextInt(1,17);
        return arr;
    }


    // 功能：用户输入号码
    public static int[] userInputNumber()
    {
        // 定义数组接收用户的输入
        int[] userInputArray = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+ (i+1)+"个红球数字:");
            int redNumber = scanner.nextInt();
            if(redNumber >=1 && redNumber <= 33) {
                if (!container(userInputArray, redNumber)) {
                    userInputArray[i] = redNumber;
                    i++;
                } else {
                    System.out.println("数字重复请重新输入");
                }
            }
            else System.out.println("非法数字，请重新输入");
        }
        while (true)
        {
            System.out.println("输入蓝色号码：");
            int blueNumber = scanner.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16) {
                userInputArray[6] = blueNumber;
                break;
            }
            else System.out.println("非法数字，请重新输入");
        }
        return userInputArray;
    }

    // 功能:判断数组中是否包含该数字
    public static boolean container(int[] arr, int num)
    {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }
}
