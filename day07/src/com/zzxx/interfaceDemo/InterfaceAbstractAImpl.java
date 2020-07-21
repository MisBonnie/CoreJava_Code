package com.zzxx.interfaceDemo;

// 2.定义实现类, 实现接口
public class InterfaceAbstractAImpl implements InterfaceAbstractA {

    @Override
    public void abstractMethod() {
        System.out.println("AAAA");
    }

    @Override
    public void abstractMethodB() {
        System.out.println("BBBB");
    }
}
