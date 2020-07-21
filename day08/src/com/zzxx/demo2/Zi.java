package com.zzxx.demo2;

public class Zi extends Fu {
    // 和父类中同名的成员变量
    int age = 20;
    // 和父类中不同的成员变量 - 子类自己单独声明的
    int score = 150;
    // 额外继承了父类中的num变量

    // 重写父类中的m1方法
    public void m1() {
        System.out.println("Zi m1方法");
    }
    // 继承了父类的m2方法

    // 子类自己的方法 m3
    public void m3() {
        System.out.println("Zi m3方法");
    }

    @Override
    public int getAge() {
        return age;
    }

}
