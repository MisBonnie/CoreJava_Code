package com.zzxx.h_LoadPicture;

public class Demo {
    public static void main(String[] args) {
        Picture picture = new Picture();
        Thread load = new Thread(){
            public void run() {
                System.out.println("图片开始加载....");
                for (int i = 0; i < 100; i++) {
                    System.out.println("正在加载: " + (i+1) + "%");
                }

                System.out.println("图片加载完成");
            }
        };
        Thread show = new Thread(){
            public void run() {
                System.out.println("等待图片加载完成....");
                // 等待 load 线程结束
                try {
                    load.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("显示图片!");
            }
        };

        load.start();
        show.start();
    }
}
