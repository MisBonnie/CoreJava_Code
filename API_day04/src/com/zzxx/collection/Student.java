package com.zzxx.collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    /**
     * this 和 o 比较
     * @param o
     * @return
     *    <0  this < o
     *    =0  this = o
     *    >0  this > o
     */
    @Override
    public int compareTo(Student o) {
        // 按照年龄排序
        return this.age - o.age;
        // 让方法返回值<0, o.age < this.age
//        return o.age - this.age;
        // 按照姓名的字典顺序排序
//        return this.name.compareTo(o.name);
    }
}
