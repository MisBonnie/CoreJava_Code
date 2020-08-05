package com.zzxx.h_RandomAccessFile;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo {
    @Test
    public void test01Write() throws IOException {
        // 文件如果不存在, 会创建新的文件
        // 文件如果存在, 原内容上直接写入新内容进行覆盖, 没有清空
        RandomAccessFile rw = new RandomAccessFile("a.txt", "rw");
        rw.write("你".getBytes());
        rw.close();
    }

    @Test
    public void test02Write() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("a.txt", "rw");
        // 查看rw对象初始的文件指针位置
        long filePointer = rw.getFilePointer();
        System.out.println("初始指针位置: " + filePointer);
        // 跳过前面6个字节, 再开始写入
        rw.skipBytes(6);
        System.out.println("跳过6个字节后位置: " + rw.getFilePointer());
        rw.write("吃了吗".getBytes());
        System.out.println("写完内容后的位置: " + rw.getFilePointer());
        rw.close();
    }

    @Test
    public void test03Write() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("a.txt", "rw");

        rw.writeDouble(Long.MAX_VALUE);

        System.out.println(rw.getFilePointer());
        rw.close();
    }

    @Test
    public void test01Read() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("a.txt", "rw");

        double d = rw.readDouble();
        System.out.println(d);
        rw.close();
    }
    @Test
    public void test02WriteAndRead() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("a.txt", "rw");
        rw.writeLong(10l);
        // 设置文件指针位置
        rw.seek(0l);
        double d = rw.readLong();
        System.out.println(d);
        rw.close();
    }
}
