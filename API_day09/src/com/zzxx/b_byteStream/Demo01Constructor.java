package com.zzxx.b_byteStream;

import org.junit.Test;

import java.io.*;

public class Demo01Constructor {
    @Test
    public void test01InputStream() throws FileNotFoundException {
        InputStream is = new FileInputStream(new File("a.txt"));
        InputStream is1 = new FileInputStream("a.txt");
    }

    @Test
    public void test01OutputStream() throws FileNotFoundException {
        OutputStream os = new FileOutputStream(new File("a.txt"));
        OutputStream os1 = new FileOutputStream("a.txt");
        // 在原有的文件末尾上追加内容
        OutputStream os2 = new FileOutputStream("a.txt", true);
        OutputStream os3 = new FileOutputStream(new File("a.txt"), true);
    }
}
