package com.zzxx.charset;

import java.io.UnsupportedEncodingException;

public class Demo02String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 手动制造乱码
        String str = "你好";
        byte[] bs = str.getBytes();
        String s = new String(bs, "ISO8859-1");
        System.out.println(s); // ä½ å¥½
        // ----------------------
        // 将 s 的乱码解决
        /*byte[] b = s.getBytes("ISO8859-1");
        s = new String(b, "UTF-8");
        System.out.println(s);*/

        // 简化成一句话
        s = new String(s.getBytes("ISO8859-1"), "UTF-8");
        System.out.println(s);
    }
}
