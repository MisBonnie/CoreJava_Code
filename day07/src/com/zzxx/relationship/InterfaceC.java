package com.zzxx.relationship;

/*
    一个接口可以继承多个接口
 */
public interface InterfaceC extends InterfaceA, InterfaceB {
    void methodAbsC();

    // 1.InterfaceA 中的抽象方法和默认方法
    // 2.InterfaceB 中的抽象方法和默认方法
    // 3.自己的抽象方法和默认方法,私有,静态
    // 4.如果父接口中有重名的默认方法, 必须重写
    default void methodDefaultA() {

    }
}
