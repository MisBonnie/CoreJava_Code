package com.zzxx.g_lock;

public class MyThread extends Thread {
    private Ticket ticket;
    public MyThread(Ticket ticket, String name) {
        super(name);
        this.ticket = ticket;
    }

    public void run() {
        // 卖票
        while (true) {
            ticket.saleTicket();
            try {
                Thread.sleep((long)(Math.random() * 90 + 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
