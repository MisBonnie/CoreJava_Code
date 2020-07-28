package com.zzxx.thread;

// 步骤1. 自定义的线程类, 继承 Thread
public class MyThread1 extends Thread {
    // 步骤2: 重写run方法, 线程要执行的任务
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("多线程执行了: " + i);
        }
    }
}
