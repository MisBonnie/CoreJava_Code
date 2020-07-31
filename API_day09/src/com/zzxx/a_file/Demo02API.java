package com.zzxx.a_file;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class Demo02API {
    @Test
    public void test01Path() {
        File file = new File("a.txt");

        // 获得file的绝对路径
        String path = file.getAbsolutePath();
        // /Users/bonnie/IdeaWorks/corejava/API_day09/a.txt
        System.out.println(path);
    }
    @Test
    public void test02() {
        File file = new File("src");
        // file对应的文件或者目录存不存在
        boolean exists = file.exists();
        System.out.println("src 存不存在:" + exists);
    }

    @Test
    public void test03() {
        File file = new File("src"); // 目录, 并且存在
        File file1 = new File("c.txt"); // 文件, 并且存在
        File file2 = new File("a.txt"); // 不存在

        System.out.println("src是目录吗? " + file.isDirectory());
        System.out.println("src是文件吗? " + file.isFile());
        System.out.println("c是目录吗? " + file1.isDirectory());
        System.out.println("c是文件吗? " + file1.isFile());

        System.out.println("a是目录吗? " + file2.isDirectory());
        System.out.println("a是文件吗? " + file2.isFile());
    }

    @Test
    public void test04() throws IOException {
        // 创建一个文件
        File file2 = new File("a.txt");
        // file2.exists() 返回true, 就表示存在, 就不能创建新文件
        // 如果文件不存在, 就创建这个文件
        // 如果文件存在, 就不创建, 也不会报错
        file2.createNewFile();
    }
    @Test
    public void test05() throws IOException {
        File file2 = new File("dir");
        // 创建目录
        file2.mkdir();
    }
    @Test
    public void test06() throws IOException {
        File file2 = new File("test/a/b");
        // 创建目录, 并且将不存在的父目录一起创建
        file2.mkdirs();
    }
    // 删除文件 a.txt, 删除目录[删除空目录, 删除非空目录] dir/b  删除test

    @Test
    public void test07() {
        // 创建一个file对象, 表示的是当前module目录 API_day09
        File file = new File(".");

        // 列出这个目录中所有的文件和目录 File对象
        File[] files = file.listFiles();
        for(File f : files) {
            System.out.println(f);
        }
        System.out.println("-----------");
        // 列出file目录下, 所有的文件和目录的名字 -- 了解
        String[] ss = file.list();
        for (String s : ss) {
            System.out.println(s);
        }
    }
    @Test
    public void test08() {
        File file = new File(".");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                // 只想保留文件, 不想保留目录
                return f.isFile();
            }
        });
        System.out.println(Arrays.toString(files));

        File[] files1 = file.listFiles((File f) -> {
                // 只想保留 txt 文件
                String name = f.getName();
                return name.endsWith(".txt");
            });
        System.out.println(Arrays.toString(files1));
        // 所有文件都保留
        file.listFiles(f -> true);
    }
}
