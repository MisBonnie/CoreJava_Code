package com.zzxx.staticclass;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        Child c1 = new Child("小明", 3);
        Child c2 = new Child("小豪", 4);

        c1.sleep();
        c2.sleep();
        // 调用静态方法
        Child.cry();
    }
}
