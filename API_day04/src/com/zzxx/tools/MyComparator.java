package com.zzxx.tools;

import com.zzxx.collection.Student;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    /**
     * 比较 o1 和 o2
     * @return >0   o1 > o2
     *         =0   o1 = o2
     *         <0   o1 < o2
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
