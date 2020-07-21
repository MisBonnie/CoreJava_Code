package com.zzxx.interfaceDemo;

// 1.定义接口
public interface InterfaceAbstractA {
    // 定义抽象方法
    void abstractMethod();

    // 再添加一个抽象方法
    void abstractMethodB();
    // 又添加了一个静态方法
    static void staticMethodC() {
        System.out.println("static MethodC");
    }
}
