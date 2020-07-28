package com.zzxx.thread;

public class Demo02Thread {
    public static void main(String[] args) {
        // 开启多线程任务
        // 步骤3.1: 创建任务对象
        MyThread2 task = new MyThread2();
        // 步骤3.2: 通过任务对象, 构造线程对象
        Thread t = new Thread(task);
        // 步骤4: 开启线程
        t.start();
        // 主方法的主线程任务
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}
