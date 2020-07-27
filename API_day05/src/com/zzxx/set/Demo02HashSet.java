package com.zzxx.set;

import java.util.HashSet;
import java.util.Set;

public class Demo02HashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("张三", 12));
        set.add(new Student("李四", 34));
        set.add(new Student("张三", 12));
        set.add(new Student("李四", 34));

        System.out.println(set);
        System.out.println(set.size());
        /**
         * 1.Student没有重写equals和hashCode, 添加进4个元素
         * 2.重写了equals方法, 但是没有重写hashCode, 添加进4个元素
         * 3.重写了hashCode方法, 但是没有重写equals, 添加进4个元素
         * 4.重写了equals和hashCode方法, 添加进2个元素
         */
    }
}
