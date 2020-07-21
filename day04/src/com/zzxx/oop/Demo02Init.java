package com.zzxx.oop;

public class Demo02Init {
    public static void main(String[] args) {
        // 1.创建Student对象 - 调用无参构造器
        Student s = new Student();
        // 2.刚创建好的对象, 成员变量是默认初始值
        // 3.给成员变量赋值
        s.name = "张三";
        s.age = 23;
        s.car = new Car();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.car);// com.zzxx.oop.Car@6979e8cb
        // 使用有参构造方法创建对象
        Student s2 = new Student("小明", 21, null);
        System.out.println(s2.name);

        Student s3 = new Student("鹏鹏", 20, new Car());
        System.out.println(s3.age);
    }
}
