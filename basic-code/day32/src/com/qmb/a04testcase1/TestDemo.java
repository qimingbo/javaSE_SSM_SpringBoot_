package com.qmb.a04testcase1;

public class TestDemo {
    public static void main(String[] args) {
          /*
            微信中的抢红包也用到了多线程。
            假设：100块，分成了3个包，现在有5个人去抢。
            其中，红包是共享数据。
            5个人是5条线程。
            打印结果如下：
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX没抢到
            	XXX没抢到
        */
          MyRunnable mr = new MyRunnable();
          Thread t1 = new Thread(mr,"线程1");
          Thread t2 = new Thread(mr,"线程2");
          Thread t3 = new Thread(mr,"线程3");
          Thread t4 = new Thread(mr,"线程4");
          Thread t5 = new Thread(mr,"线程5");

          t1.start();
          t2.start();
          t3.start();
          t4.start();
          t5.start();
    }
}
