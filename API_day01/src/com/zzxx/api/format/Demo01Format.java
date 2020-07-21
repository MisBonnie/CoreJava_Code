package com.zzxx.api.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Format {
    public static void main(String[] args) throws ParseException {
        // 为了显示时间 Date -> String
        Date date = new Date();
        System.out.println(date);

        // 构造SimpleDateFormat对象, 需要传参 - 格式
        // 2020-07-21  16:47:55
        // yyyy-MM-dd HH:mm:ss E
        SimpleDateFormat sf = new
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String str = sf.format(date);
        System.out.println(str);

        // ------------------------
        // 自行输入日期(String) -> Date  19980228
        String s = "19980228";
        SimpleDateFormat sf1 = new
                SimpleDateFormat("yyyyMMdd");
        Date date1 = sf1.parse(s);
        System.out.println(sf.format(date1));
    }
}
