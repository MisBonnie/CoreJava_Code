package com.zzxx.api.date;

import java.util.Calendar;
import java.util.Date;

public class Demo05CalendarAPI2 {
    public static void main(String[] args) {
        // 1.获得万年历对象 2020-7-21
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // 入职10周年, 当月的第三周的周五
        cal.add(Calendar.YEAR, 10);
        cal.set(Calendar.WEEK_OF_MONTH, 3);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);

        // 2.将 Calendar 转换成 Date 类型, 再来打印
        Date date = cal.getTime();
        System.out.println(date);
    }
}
