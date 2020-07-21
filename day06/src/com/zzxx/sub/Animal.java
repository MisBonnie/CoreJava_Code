package com.zzxx.sub;

/**
 * 动物类
 */
public class Animal extends Object {
    String name;
    char sex;
    int age;
    Animal() {
        sex = '男';
        System.out.println("Animal空参构造器");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("Animal有参构造器");
    }

    void eat() {
        System.out.println(this.name + "在吃好吃的!");
    }
}
