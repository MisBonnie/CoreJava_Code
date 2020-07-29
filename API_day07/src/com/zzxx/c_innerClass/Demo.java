package com.zzxx.c_innerClass;

public class Demo {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        t.start();
        Runnable run = new Runnable() {
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        Thread t1 = new Thread(run);
        t1.start();
    }
}
