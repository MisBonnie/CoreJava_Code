package com.zzxx.f_safe;

public class MyThread extends Thread {
    private Ticket ticket;
    public MyThread(Ticket ticket, String name) {
        super(name);
        this.ticket = ticket;
    }

    public void run() {
        // 卖票
        while (ticket.count > 0) {
            ticket.saleTicket();
            try {
                Thread.sleep((long)(Math.random() * 90 + 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
