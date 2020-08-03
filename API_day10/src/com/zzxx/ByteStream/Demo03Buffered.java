package com.zzxx.ByteStream;

import org.junit.Test;

import java.io.*;

public class Demo03Buffered {
    @Test
    public void test01() throws IOException {
        // 缓冲流是用字节流来包装的
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("a.txt"));
        // API 就是 InputStream 的api


    }

    @Test
    public void test02() throws IOException {
        // 缓冲流是用字节流来包装的
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("a.txt"));
        // API 就是 OutputStream 的api
    }
}
