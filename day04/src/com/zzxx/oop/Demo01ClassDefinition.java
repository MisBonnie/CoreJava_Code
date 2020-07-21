package com.zzxx.oop;

import java.util.Scanner;

/**
 * 用来写主方法
 */
public class Demo01ClassDefinition {
    public static void main(String[] args) {
        int a = 1;
        // 创建对象 - 引用类型
        Student stu = new Student();
        // 使用对象的成员变量
        stu.age = 21; // 赋值
        stu.name = "小明";
        // 使用对象的成员方法
        stu.study("java");
        System.out.println(stu.age);
        stu.car = new Car();

        Student stu1 = new Student();
        stu1.name = "小明";
        System.out.println(stu1.age);

        // 4.创建对象
        Car car = new Car();
        // 5.给成员变量赋值或者使用成员变量
        car.price = 10000000;
        car.name = "宾利";
        car.color = "黄色";
        // 6.使用成员方法
        car.run("宗昕");
    }
}
