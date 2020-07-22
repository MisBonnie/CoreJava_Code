package com.zzxx.baozhuang;

public class Demo02Integer {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = new Integer(100);
        // 结论1: Integer也有常量池
        System.out.println(i1 == i2); // true
        i1 = 128;
        i2 = 128;
        // 结论2: 常量池的范围: -128 ~ 127
        System.out.println(i1 == i2); // false

        Integer i4 = Integer.valueOf(127);
        Integer i5 = Integer.valueOf(127);
        System.out.println(i4 == i5);
    }
}
