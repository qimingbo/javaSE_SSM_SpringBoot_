package com.qmb.a08threadpool1;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
       /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
      */
        // 1.创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        MyRunnable mr = new MyRunnable();
        // 2.往线程池中添加任务
        threadPool.submit(mr);
        threadPool.submit(mr);
        threadPool.submit(mr);
        threadPool.submit(mr);
        threadPool.submit(mr);
        // 3.销毁线程池
        threadPool.shutdown();
    }
}
