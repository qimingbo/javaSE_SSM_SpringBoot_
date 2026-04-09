package com.qmb.a03runtime;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        /*
         public static Runtime getRuntime() 当前系统的运行环境对象
         public void exit(int status) 停止虚拟机
         public int availableProcessors() 获得CPU的线程数
         public long maxMemory() JVM能从系统中获取总内存大小（单位byte)
         public long totalMemory() JVM己经从系统中获取总内存大小（单位byte)
         public long freeMemory() JVM剩余内存大小（单位byte)
         public Process exec(string command) 运行cmd命令
         */
        // 1.创建Runtime对象
        Runtime r1 = Runtime.getRuntime();
        // 2.停止虚拟机 ,System类下的exit方法是调用的该方法
        // r1.exit(0);

        // 3.获取cpu的线程数
        int i = r1.availableProcessors();
        System.out.println(i);

        // 4. JVM能从系统中获取总内存大小（单位byte)
        long l1 = r1.maxMemory();
        System.out.println(l1/1024/1024);

        // 5.JVM己经从系统中获取总内存大小（单位byte)
        long l2 = r1.totalMemory();
        System.out.println(l2/1024/1024);

        // 6.JVM剩余内存大小（单位byte)
        long l3 = r1.freeMemory();
        System.out.println(l3/1024/1024);

        // 7.运行cmd命令
        // 好玩的命令
        // shutdown:关机
        // -s:默认在1分钟后关机
        // -s -t 指定时间:指定关机时间
        // -a:取消关机操作
        // -r:关机并重启
        r1.exec("shutdown -s -t 3600");


    }

}
