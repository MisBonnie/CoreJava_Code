package com.zzxx.interfaceDemo;

/**
 * class: 类
 * interface: 接口, 另一种引用类型
 * 引用类型: 数组, 类, 接口
 * xx.java -> xx.class -> 加载
 * JDK1.7
 */
public interface InterfaceDemoA {
    // 公开的抽象方法 - 练习时建议这么写
    public abstract void m1();
    // 接口不是类, 所以没有子类, protected不能用
//    protected abstract void m2();
    // 也是公开的抽象方法, 默认添加public
    abstract void m2();
    // 也是公开的抽象方法, 默认添加abstract
    public void m3();

    // 也是公开的抽象方法 - 开发时这么写
    void m4();
}
