package com.zzxx.f_ConstructorMethodReference;

public class Person {
    private String name;

    public Person() {
        System.out.println("无参构造方法");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("有参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
