package com.zzxx.i_waitAndNotify;

public class ShowPicture extends Thread {
    private Picture picture ;
    public ShowPicture(Picture picture ) {
        this.picture = picture;
    }

    public void run() {
        System.out.println("等待图片加载完成....");
        // 等待图片状态 isLoad = true
        // 当图片没有加载完成, 显示线程 等待
        if (!picture.isLoad) {
            synchronized (picture) {
                try {
                    picture.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        // 假设图片已经加载完成
        System.out.println("显示图片!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("图片显示完成!");
        // 改变图片显示状态
        picture.isShow = true;

        // 图片开始下载了 - 唤醒"下载线程"
        synchronized (picture) {
            picture.notify();
        }
    }
}
