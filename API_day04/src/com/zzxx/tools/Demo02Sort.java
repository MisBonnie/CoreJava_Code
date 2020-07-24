package com.zzxx.tools;

import com.zzxx.collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Demo02Sort {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(9);
        li.add(3);
        li.add(2);
        li.add(7);
        li.add(5);
        System.out.println("排序之前: " + li);
        Collections.sort(li);
        System.out.println("排序之后: " + li);

        List<String> ls = new ArrayList<>();
        ls.add("lucy");
        ls.add("zhangsan");
        ls.add("tom");
        ls.add("lisi");
        ls.add("jack");
        System.out.println("排序之前: " + ls);
        Collections.sort(ls);
        System.out.println("排序之后: " + ls);

        List<Date> ld = new ArrayList<>();
        ld.add(new Date());
        ld.add(new Date(0));
        ld.add(new Date(100000));
        ld.add(new Date(4346545645l));
        System.out.println("排序之前: " + ld);
        Collections.sort(ld);
        System.out.println("排序之后: " + ld);

        List lstu = new ArrayList<>();
        lstu.add(new Student("lucy", 23));
        lstu.add(new Student("jack", 25));
        lstu.add(new Student("tom", 18));
        lstu.add(new Student("zhangsan", 8));
        System.out.println("排序之前: " + lstu);
        Collections.sort(lstu);
        System.out.println("排序之后: " + lstu);
    }
}
