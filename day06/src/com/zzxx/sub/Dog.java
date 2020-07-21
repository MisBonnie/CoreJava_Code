package com.zzxx.sub;

/**
 * 小狗类 继承了 动物类
 * 1.概念:子类/衍生类/扩展类: Dog  父类/基类: Animal
 * 2.子类继承父类, 就继承了父类所有的成员变量和方法
 * 3.所有的类, 都有唯一的父类, 如果没有写父类, 说明父类就是:Object
 * 4.子类中还可以定义自己的独特的成员变量和方法
 *   子类的功能一定比父类要强大
 */
public class Dog extends Animal {
    String name;
    Dog() {
        // 调用父类有参构造方法
        super("");
        System.out.println("Dog空参构造器");
    }
    Dog(String name) {
        super(); // 默认调用父类无参构造方法
        super.name = name;
        this.name = "小强";
        System.out.println("Dog有参构造器");
    }
    void wang() {
        System.out.println(name + "汪汪!");
    }
    // 重写的父类中的eat
    void eat() {
        // 子类自己的功能
        System.out.println(this.name + "舔舔小爪子!");
        // 和父类中的eat方法一致
        super.eat();
        // 子类自己的功能
        System.out.println(this.name + "舔舔嘴巴!");
    }
}
