package com.zzxx.tools;

import com.zzxx.collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo03SortComparator {
    public static void main(String[] args) {
        List<Student> lstu = new ArrayList<>();
        lstu.add(new Student("lucy", 23));
        lstu.add(new Student("jack", 25));
        lstu.add(new Student("tom", 18));
        lstu.add(new Student("zhangsan", 8));
        System.out.println("排序之前: " + lstu);
        // 使用自定义比较器进行排序
        Collections.sort(lstu, new MyComparator());
        System.out.println("排序之后: " + lstu);
    }
}
