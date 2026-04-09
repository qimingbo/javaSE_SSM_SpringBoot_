package com.qmb.a09threadpool2;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        // 向Java虚拟机返回可用处理器的数目
        // 本电脑的cpu是4核8线程
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println("处理器数目:" + i);
    }
}
