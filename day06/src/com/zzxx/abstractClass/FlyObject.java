package com.zzxx.abstractClass;

/**
 * 飞行物
 */
public abstract class FlyObject {
    int x;
    int y;
    FlyObject() {
        System.out.println();
    }
    // 公共部分, 为了让所有的子类统一
    // 父类方法体没有意义 - 抽象方法
    abstract void move();
}
