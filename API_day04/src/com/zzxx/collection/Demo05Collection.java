package com.zzxx.collection;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collection;

public class Demo05Collection {
    public static void main(String[] args) {
        Collection<Student> col = new ArrayList<>();
        Student s1 = new Student("张老三", 34);
        Student s2 = new Student("李老六", 43);

        col.add(s1);
        col.add(s2);
        System.out.println(col);

        Student s3 = new Student("张老三", 34);
        col.remove(s3); // 内部调用equals方法判断对象是否一致
        System.out.println(col);
    }
}
