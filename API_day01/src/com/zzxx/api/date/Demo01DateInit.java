package com.zzxx.api.date;

import java.util.Date;

public class Demo01DateInit {
    public static void main(String[] args) {
        // 空参构造方法 -> 当前系统时间
        Date date = new Date();
        // Tue Jul 21 11:48:57 CST 2020
        System.out.println(date);

        // 参数是long类型的构造方法
        Date date1 = new Date(0l + 30l*24*60*60*1000);
        System.out.println(date1);
    }
}
