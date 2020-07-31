package com.zzxx.a_file;

import org.junit.Test;

import java.io.File;

public class Demo04Delete {
    // 删除目录, 要删除目录中所有的file对象
    public void deleteFile(File file) {
        // 结束递归的条件: 1.file对象本身就是文件. 2.file是一个空目录
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                deleteFile(f);
            }
        }
        file.delete();
    }
    @Test
    public void test01() {
        File file = new File("test");
        deleteFile(file);
    }
    @Test
    public void test02() {
        // file 普通文件
        File file = new File("a.txt");
        File[] files = file.listFiles();
        System.out.println(files); // null
    }
    @Test
    public void test03() {
        // file 空白目录
        File file = new File("test/c");
        File[] files = file.listFiles();
        System.out.println(files.length);
    }
}
