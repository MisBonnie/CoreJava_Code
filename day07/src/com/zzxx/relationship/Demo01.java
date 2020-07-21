package com.zzxx.relationship;

public class Demo01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        // zi 中可以调用的方法
        // 1.Fu中继承的, 重写的
        // 2.所有的接口中重写的, 继承的default
        // 3.自己写的
        zi.methodDefaultA();
    }
}
