package com.zzxx.api.date;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class Demo03Calendar {
    public static void main(String[] args) {
        // 1.获得万年历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // 2.get set add
        // 1). 获得cal对应的月份, 月份从0开始
        int month = cal.get(Calendar.MONTH);
        System.out.println("month: " + month); // 6
        // 2). 获得cal对应的年份
        int year = cal.get(Calendar.YEAR);
        System.out.println("year: " + year); // 2020
        // DATE  DAY_OF_MONTH
        // HOUR MINUTE SECOND DAY_OF_WEEK
        // HOUR_OF_DAY

        // 3) 今天时间是:2020-7-21 ->设置为2020-8-15
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(cal);

        // 2020-8-15


    }
}
