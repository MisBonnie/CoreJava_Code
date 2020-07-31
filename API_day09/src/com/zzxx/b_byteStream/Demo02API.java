package com.zzxx.b_byteStream;

import org.junit.Test;

import java.io.*;

public class Demo02API {
    @Test
    public void test01Write() throws IOException {
        // a.txt 现在不存在
        /*
          如果文件不存在, 会创建新的文件, 然后再写入内容
          如果文件存在, 会清空原来的内容, 然后再写入
         */
        OutputStream os = new FileOutputStream("a.txt");
        // 以字节为单位写入, 只写入一个字节
        // 00000000 00000000 00000001 00000000
        os.write(229);
        os.write(147); // 'a' = 97
        os.write(136); // 'A' = 65
        os.write(48); // '0' = 48
        // 10000000 00000000 00000000 00000001
        // 反:11111111 11111111 11111111 11111110
        // 补:11111111 11111111 11111111 11111111
        os.write(-1); // 11111111
    }
    @Test
    public void test01Read() throws IOException {
        /*
           如果文件不存在, 就会抛出 FileNotFoundException
         */
        InputStream is = new FileInputStream("a.txt");
        // 读一个字节 8位 放入int的 32位 中的低八位, 其他空位都补0
        int i ;
        while((i = is.read()) != -1) {
            System.out.println("i:" + i);
        }
    }
    @Test
    public void copy() throws IOException {
        InputStream is = new FileInputStream("a.txt");
        OutputStream os = new FileOutputStream("a_bak.txt");
        int i ;
        while((i = is.read()) != -1) {
            os.write(i);
        }
    }
}
