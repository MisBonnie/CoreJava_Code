package com.zzxx.b_runnable;

public class Demo {
    public static void main(String[] args) {
        MyThread task = new MyThread();
        Thread t = new Thread(task, "线程1");
        t.start();

        Thread t1 = new Thread(task, "线程2");
        t1.start();
    }
}
