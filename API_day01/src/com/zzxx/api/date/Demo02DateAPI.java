package com.zzxx.api.date;

import java.util.Date;

/*
计算/改变date对象表示的时间点:
  date.getTime(); -> 得到date现在表示的时间点对应的毫秒值
  long time -> 计算得到新的time 毫秒值
  date.setTime(time); -> 设置date表示的时间点为time时间
 */
public class Demo02DateAPI {
    public static void main(String[] args) {
        Date date = new Date();
        // 将时间从date类型, 转换成了long类型所表示的毫秒值
        long time = date.getTime();
        System.currentTimeMillis();
        System.out.println("time: " + time);

        // 一个月以后的date时间
        time += 30l*24*60*60*1000;
        date.setTime(time);
        System.out.println(date);

        Date date1 = new Date(0l);
        // date1 是否在 date 的后面
        boolean b = date1.after(date);
        System.out.println(b);
        // date1 是否在 date 的前面
        boolean b2 = date1.before(date);
        System.out.println(b2);
    }
}
