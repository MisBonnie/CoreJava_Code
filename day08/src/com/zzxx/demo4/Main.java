package com.zzxx.demo4;

public class Main {
    public static void main(String[] args) {
        // 在无关类中 使用Body的内部类Heart
        Body body = new Body();
        // 间接调用内部类
        body.walk();

        // 直接调用内部类, 通过外部类对象创建内部类对象
        Body.Heart heart = body.new Heart();
        heart.beat();
    }
}
