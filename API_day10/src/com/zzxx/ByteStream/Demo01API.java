package com.zzxx.ByteStream;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class Demo01API {
    @Test
    public void test01Write() throws IOException {
        OutputStream os = new FileOutputStream("a.txt");
        // 11111111
        os.write(-1);
    }
    @Test
    public void test01Read() throws IOException {
        InputStream is = new FileInputStream("a.txt");
        int a;
        while ((a = is.read()) != -1) {
            System.out.println(a);
        }
    }
    @Test
    public void test02Write() throws IOException {
        OutputStream os = new FileOutputStream("a.txt");
        String str = "你好, 你吃了吗?";
        // 字符串 -> 字节数组 [编码]
        byte[] bs = str.getBytes("gbk");
        os.write(bs);
        //[-60, -29, -70, -61, 44, 32, -60, -29, -77, -44, -63, -53, -62, -16, 63]
        System.out.println(Arrays.toString(bs));
    }
    @Test
    public void test02Read() throws IOException {
        InputStream is = new FileInputStream("a.txt");
        byte[] bs = new byte[5];
        int i = is.read(bs);
        System.out.println("i: " + i);
        System.out.println("bs: " + Arrays.toString(bs));

        i = is.read(bs);
        System.out.println("i: " + i);
        System.out.println("bs: " + Arrays.toString(bs));

        i = is.read(bs);
        System.out.println("i: " + i);
        System.out.println("bs: " + Arrays.toString(bs));
    }

    @Test
    public void test03Read() throws IOException {
        InputStream is = new FileInputStream("a.txt");
        byte[] bs = new byte[6];
        int len ;
        while((len = is.read(bs)) != -1) {
            System.out.println("len: " + len);
            System.out.println("bs: " + Arrays.toString(bs));
        }
    }
    @Test
    public void test03Write() throws IOException {
        OutputStream os = new FileOutputStream("a.txt");
        String str = "你好, 你吃了吗?";
        // 字符串 -> 字节数组 [编码]
        byte[] bs = str.getBytes("gbk");
        // 等同于  os.write(bs);
        os.write(bs, 0, bs.length);
        os.write(bs, 2, 3); // 好,
        //[-60, -29, -70, -61, 44, 32, -60, -29, -77, -44, -63, -53, -62, -16, 63]
        System.out.println(Arrays.toString(bs));
    }
}
