package com.zzxx.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo01StringCharset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好";

        // 字符 -> 字节 (编码)
        byte[] bs = str.getBytes();
        System.out.println(str);
        // [-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bs));
        // [-60, -29, -70, -61]
        byte[] bs1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bs1));

        // 字节 -> 字符 (解码)
        String s1 = new String(bs);
        System.out.println("s1: " + s1);

        String s2 = new String(bs1, "gbk");
        System.out.println("s2: " + s2);
    }
}
