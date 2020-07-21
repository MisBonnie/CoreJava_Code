package com.zzxx.staticclass;

/**
 * 静态的成员变量:
 *   1.属于类
 *   2.通过类名. 调用 例如 Child.money
 *   3.只有一个
 *
 * 普通成员变量:
 *   1.属于对象
 *   2.通过对象. 调用 例如 c1.name
 *   3.有几个对象, 就有几个成员变量
 *
 * 静态方法:
 *   1.属于类
 *   2.通过类. 调用 例如 Child.cry()
 *   3.在静态方法中, 不能直接使用普通成员变量和成员方法
 *   4.在普通方法中, 可以直接使用静态变量和静态方法
 */
public class Child {
    String name;
    int age;
    // 通常是声明的同时初始化
    static int money;
    // 静态代码块 -> 给类初始化 - 类加载时执行的
    static {
        money = 1000;
        System.out.println("静态代码块被执行了");
    }
    // 代码块: 调用构造器之前
    // 给对象初始化, 提取所有构造方法中重复的代码
    {
        money++;
        System.out.println("代码块");
    }
    Child () {
        System.out.println("无参构造器");
    }
    Child(String name, int age) {
        this.name = name;
        this.age = age;
        // 通常静态成员变量不会在构造方法中初始化
        // money = 100;
        System.out.println("有参构造器");
    }
    static void cry() {
        System.out.println(/*name +*/ "在放声哭!");
//        this.sleep();
    }
    void sleep() {
        cry();
        System.out.println(name + "在睡觉觉!");
        System.out.println("抱着" + money + "的零花钱");
    }
}
