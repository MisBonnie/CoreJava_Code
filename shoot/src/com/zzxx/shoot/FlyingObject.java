package com.zzxx.shoot;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;

/*
    飞行物类, 所有飞行物的父类
 */
public abstract class FlyingObject {
    private int x;
    private int y;
    private BufferedImage img;
    private int width;
    private int height;
    private int life;
    // 用来存放自己被打掉后的残影图片 - 在每一个子类中进行初始化, 将飞行物自己对应的残影图片一起存入数组
    protected BufferedImage[] ember;

    protected FlyingObject(int x, int y, BufferedImage img, int life) {
        this.img = img;
        this.width = img.getWidth();
        this.height = img.getHeight();
        this.x = x;
        this.y = y;
        this.life = life;
    }
    // 移动的方法
    public abstract void move();
    public void minusLife() {
        this.life --;
    }

    // 判断飞行物被子弹撞击的方法
    public boolean shootByBullet(Bullet b) {
        int b_x = b.getX();
        int b_y = b.getY();

        return b_x >= this.x && b_x <= this.x+this.width
                && b_y >= this.y && b_y <= this.y + this.height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLife() {
        return life;
    }

}
