package com.zzxx.a_thread;

/*
一个类只能有一个父类, 当他继承了Thread,
这个类就只能是线程类, 有局限性
 */
public class MyThread1 extends Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + ": " + i);
            Thread.yield();
        }
    }
}
