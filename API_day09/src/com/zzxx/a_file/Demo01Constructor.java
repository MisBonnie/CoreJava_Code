package com.zzxx.a_file;

import org.junit.Test;

import java.io.File;

public class Demo01Constructor {
    @Test
    public void test01() {
        // 传入文件路径, 构造File对象
        // 注意: new 出来的File对象, 只是在JVM内存中有一个对象而已
        //      和本地磁盘有没有这个文件, 无关 !
        File file = new File("a.txt");
        System.out.println(file);
    }
    @Test
    public void test02() {
        // 传入文件父路径 和 子路径, 共同构造File对象
        File file = new File("b/c","d/a.txt");
        System.out.println(file); // b/c/d/a.txt
    }
}
