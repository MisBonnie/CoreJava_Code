package com.zzxx.staticclass;

public class Demo03StaticBlock {
    public static void main(String[] args) {
        // 使用类的三种情况
        // 1.创建对象
        Child c = new Child();
        Child c1 = new Child("小明", 3);

        // 2.调用静态成员变量
//        Child.money ++;

        // 3.调用静态方法
//        Child.cry();
    }
}
