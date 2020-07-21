package com.zzxx.interfaceDemo;

public class InterfaceDefaultImpl implements InterfaceDefault {
    // 实现接口中的抽象方法
    @Override
    public void methodAbs1() {
        System.out.println("methodAbs1");
    }
    // 相当于将默认方法 继承过来了
}
