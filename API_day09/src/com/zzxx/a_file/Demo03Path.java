package com.zzxx.a_file;

import org.junit.Test;

import javax.swing.*;
import java.io.File;

public class Demo03Path {
    @Test
    public void test01() {
        File file = new File("a.txt");
        // a.txt 的路径参考值: 当前这个 module
        System.out.println(file.getAbsoluteFile());
    }
    @Test
    public void test02() {
        String path = Demo03Path.class.
                getResource("a.txt").getPath();
        // a.txt 路径的参考值: 当前类的编译目录 - 就是当前这个包
        // 直接理解为: a.txt 和 当前这个类 同一个包
        // /Users/bonnie/IdeaWorks/corejava/out/production/API_day09/com/zzxx/a_file/a.txt
        System.out.println(path);
    }
    @Test
    public void test03() {
        String path = Demo03Path.class.getClassLoader()
                .getResource("b.txt").getPath();
        // b.txt 路径的参考值: 当前这个模块编译后的根目录 classpath - 类路径
        // 直接理解为: b.txt 就是在src下的
        // /Users/bonnie/IdeaWorks/corejava/out/production/API_day09/b.txt
        System.out.println(path);
    }
}
