package com.zzxx.set;

import java.util.HashSet;
import java.util.Set;

public class Demo03HashSetRemove {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 12);
        Student s2 = new Student("李四", 34);
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
        // 属性值发生了改变
        s1.setAge(21);
        // 移除的时候,重新计算位置,发现位置上找不到s1对象,不会移除
        set.remove(s1);
        System.out.println(set.size());

    }
}
