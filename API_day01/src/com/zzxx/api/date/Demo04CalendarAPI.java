package com.zzxx.api.date;

import java.util.Calendar;

public class Demo04CalendarAPI {
    public static void main(String[] args) {
        // 1.获得万年历对象 2020-7-21
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // 2) 保质期7天, 求当天是几号
//        cal.add(Calendar.DATE, 7);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        // 当加的内容结果跨月\年\星期, 自动进行推算
        // 保质期48天, 求当天是几号  2020-9-7
        cal.add(Calendar.DATE, 48);
        // 到期日往前推两周
        cal.add(Calendar.WEEK_OF_MONTH, -2);
        // 要周四
        cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);

    }
}
