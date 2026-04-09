package com.qmb.a10threadsafe2;

import java.beans.beancontext.BeanContext;

public class MyThread extends Thread {
    private static int ticket = 0;

    @Override
    public void run() {
        // 1.循环
        while (true) {
            //2.同步代码块（同步方法）
            if(method()) break;
        }
    }

    private static synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果没有到末尾
        if(ticket < 100)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
        }
        //4.判断共享数据是否到了末尾，如果到了末尾
        else {
            return true;
        }
        return  false;
    }
}

