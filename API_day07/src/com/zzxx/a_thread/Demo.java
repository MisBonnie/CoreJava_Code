package com.zzxx.a_thread;

public class Demo {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }*/

        Thread t = new MyThread1("线程1");
        t.start();

        Thread t1 = new MyThread1("线程2");
        t1.start();

        /*for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
            Thread.yield();
        }*/
    }
}
