package com.qmb.a03threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCase3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            多线程的第二种创建方式:
            特点：可以获取到多线程运行的结果
                1.创建一个类，实现Callable接口
                2.重写call(是有返回值的，表示多线程运行的结果)
                3.创建MyCall的对象（表示多线程要执行的任务）
                4.创建FutureTask的对象（作用是管理多线程运行的结果）
                5.创建Thread类的对象，并启动（表示线程）
         */
        // 创建MyCall对象（表示多线程要执行的任务）
        MyCall mc = new MyCall();
        // 创建FutureTask的对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程的对象
        Thread t = new Thread(ft);
        // 启动线程
        t.start();

        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
