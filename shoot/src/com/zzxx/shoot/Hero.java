package com.zzxx.shoot;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.util.ArrayList;

/*
    英雄机类 继承自 飞行物类
 */
public class Hero extends FlyingObject {
    private int score;

    public Hero() {
        super(170, 400, Main.hero0, 3);
    }

    private int count = 0; // 用来记录图片
    private BufferedImage[] heroImgs = {Main.hero0, Main.hero1};
    @Override
    public void move() {
        // 切换图片
        count ++;
        setImg(heroImgs[count/10 % 2]);
        /*if(count % 2 == 0) {
            setImg(Main.hero0);
        } else {
            setImg(Main.hero1);
        }*/
    }
    public void addScore(int score) {
        this.score += score;
    }
    public void addLife() {
        this.setLife(this.getLife() + 1);
    }
    // 新增变量, 标记双倍火力剩余次数
    private int doubleFire = 0;
    public void addDoubleFire() {
        doubleFire += 20;
    }
    // 发射子弹, 生成新的子弹, 并返回
    public Bullet[] shoot() {
        Bullet[] bullets;
        if (doubleFire == 0) {
            bullets = new Bullet[1];
            // 根据英雄机的x和y,计算子弹的x和y
            bullets[0] = new Bullet(this.getX() + this.getWidth() / 2, this.getY());
        } else {
            bullets = new Bullet[2];
            bullets[0] = new Bullet(this.getX() + this.getWidth() / 4, this.getY());
            bullets[1] = new Bullet(this.getX() + this.getWidth() / 4 * 3, this.getY());
            doubleFire --;
        }

        return bullets;
    }
    // 判断英雄机和敌机有没有相撞
    public boolean shootByFlying(FlyingObject fly) {
        // this.x this.y fly.getX() fly.getY()
        // 自行完成判断
        return false;
    }

    public int getScore() {
        return score;
    }

}
