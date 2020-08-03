package com.zzxx.objectStream;

import java.io.Serializable;

public class Student implements Serializable {
    // 序列化后的版本编号, 不指定的话,
    // 会自动生成一串, 会随着类内容的修改而改变
    public static final long serialVersionUID = 1234l;
    private String name;
    private int age;
    // 序列化的时候, sex对应的值会被忽略
    private transient char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

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

    public Student() {
    }
}
