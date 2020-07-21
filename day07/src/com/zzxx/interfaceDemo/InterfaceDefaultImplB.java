package com.zzxx.interfaceDemo;

public class InterfaceDefaultImplB implements InterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("methodAbs1  BBB");
    }
    // 重写了默认的方法
    public void defaultMethod() {
        System.out.println("Default BBBB");
    }
}
