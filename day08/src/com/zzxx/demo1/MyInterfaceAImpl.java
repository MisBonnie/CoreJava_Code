package com.zzxx.demo1;

public class MyInterfaceAImpl implements MyInterfaceA {
    @Override
    public void methodAbs1() {
        System.out.println("第一个抽象方法的实现");
    }

    @Override
    public void methodAbs2() {
        System.out.println("第二个抽象方法的实现");
    }
}
