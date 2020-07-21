package com.zzxx.abstractClass;

/**
 * 敌机
 */
public /*abstract*/ class Airplane extends FlyObject {
    int life;
    Airplane() {
        super();
    }
    // 重写方法 -> 实现方法
    void move() {
        System.out.println("敌机向下移动");
    }
}
