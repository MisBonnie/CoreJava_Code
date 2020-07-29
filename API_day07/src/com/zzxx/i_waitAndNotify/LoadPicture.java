package com.zzxx.i_waitAndNotify;

public class LoadPicture extends Thread {
    private Picture picture;
    public LoadPicture(Picture picture) {
        this.picture = picture;
    }

    public void run() {
        // 图片进入加载过程
        System.out.println("图片开始加载....");
        for (int i = 0; i < 100; i++) {
            System.out.println("正在加载: " + (i+1) + "%");
        }
        System.out.println("图片加载完成");
        // 设置图片状态为已加载完成
        picture.isLoad = true;

        // 图片要开始下载了 - 唤醒正在等待的"显示线程"
        synchronized (picture) {
            picture.notify();
        }
        // 等待图片显示完成
        if (!picture.isShow) {
            synchronized (picture) {
                try {
                    picture.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // 假设图片已经限时完成
        System.out.println("图片开始下载....");
        for (int i = 0; i < 100; i++) {
            System.out.println("正在下载: " + (i+1) + "%");
        }
        System.out.println("图片下载完成");
    }
}
