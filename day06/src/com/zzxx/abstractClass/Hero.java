package com.zzxx.abstractClass;

/**
 * 自己的飞机
 */
public class Hero extends FlyObject {
    int score;

    void move() {
        System.out.println("英雄机跟着鼠标动, 发射");
    }
}
