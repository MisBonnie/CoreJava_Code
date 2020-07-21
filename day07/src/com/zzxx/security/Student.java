package com.zzxx.security;

/**
 * 类的封装
 * 成员变量 field: 类中定义的变量
 * 属性: 是有多少对 get/set 方法
 *
 *
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
