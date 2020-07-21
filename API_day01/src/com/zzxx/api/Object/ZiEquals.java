package com.zzxx.api.Object;

import java.util.Objects;

public class ZiEquals {
    private String name;
    private int age;

    public ZiEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*public boolean equals(Object obj) {
        // this-ZiEquals 和 obj-Object
        // 1.this == obj, 一定相等
        if (this == obj) {
            return true;
        }
        // 2.类型不一致,一定是不等
        if (!(obj instanceof ZiEquals)) {
            return false;
        }
        // 3.类型一致,不是同一个对象,才要比较属性内容
        ZiEquals zi = (ZiEquals) obj;
        if(this.name == zi.name)
        if(this.name != null)  this.name.equals(zi.name)
        if(this.name == null && zi.name) zi.name.equals(this.name)
        return zi.age == this.age && this.name.equals(zi.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZiEquals ziEquals = (ZiEquals) o;
        return age == ziEquals.age &&
                Objects.equals(name, ziEquals.name);
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
}
