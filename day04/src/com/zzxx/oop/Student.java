package com.zzxx.oop;

/**
 * 学生 实体类
 */
public class Student {
    // 成员变量 -> 可以不用初始化, 默认初始值
    // 默认初始值: 基本数据类型:0  引用类型:null
    String name;
    int age;
    // 类中的成员变量是Car类型, Car也是一个类
    Car car;

    // 构造方法/构造器
    Student() { // 无参构造器
//        this("无名", 100, null);
    }
    Student(String name, int age, Car car) { // 有参构造器
//        this();
        // 成员变量和临时变量同名, 使用时, 就近原则
        // 这时, 想要用成员变量, 需要借助this
        this.name = name;
        this.age = age;
        this.car = car;
//        this.study("java");
    }

    // 成员方法
    void study(String subject) {
        System.out.println(name + "正在学习" + subject);
    }
}
