package com.zzxx.api.date;

import java.util.Calendar;
import java.util.Date;

public class Demo06Transfer {
    public static void main(String[] args) {
        // 1.Date -> long
        Date date = new Date();
        long time = date.getTime();

        // 2.long -> Date
        date.setTime(time);
        // 如果原先没有Date对象, 可以通过long创建一个新的Date对象
        Date date2 = new Date(time);
        // --------------------------
        // 3.Calendar -> Date
        Calendar cal = Calendar.getInstance();
        Date date3 = cal.getTime();

        // 4.Date -> Calendar
        Date date4 = new Date(0);
        cal.setTime(date4);
        // --------------------
        // 5.Calendar -> long (了解)
        Calendar cal1 = Calendar.getInstance();
        long time2 = cal1.getTimeInMillis();

        // 6.long -> Calendar (了解)
        cal1.setTimeInMillis(time2 + 1000);
    }

}
