package com.zzxx.thread;

import javax.swing.*;

// 步骤1. 自定义的任务类, 实现 Runnable
public class MyThread2 implements Runnable {
    // 步骤2: 重写run方法, 线程要执行的任务
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("多线程执行了: " + i);
        }
    }
}
