package com.zzxx.exception;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// 已知的已检查异常
public class Demo01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        sf.parse("2020/07-28");


        try {
            ImageIO.read(Demo01.class.getResourceAsStream("a.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new String(new byte[10], "gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
