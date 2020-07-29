package com.zzxx.b_runnable;

/*
类实现 Runnable 接口, 还可以继承其他的类,和其他的接口
功能扩展性比较强, 没有太多局限性

相同任务的线程, 任务对象可以重复使用
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
