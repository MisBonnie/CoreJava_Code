package com.zzxx.abstractClass;

public class Demo01AbstractInit {
    public static void main(String[] args) {
        // 抽象类不能直接new对象
//        FlyObject fly = new FlyObject();

        Hero hero = new Hero();
        hero.move();

        Airplane plane = new Airplane();
        plane.move();
    }
}
