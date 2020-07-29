package com.zzxx.f_safe;

public class Demo {
    public static void main(String[] args) {
        // 100张票
        Ticket ticket = new Ticket();

        MyThread t1 = new MyThread(ticket, "窗口1");
        MyThread t2 = new MyThread(ticket, "窗口2");
        MyThread t3 = new MyThread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
