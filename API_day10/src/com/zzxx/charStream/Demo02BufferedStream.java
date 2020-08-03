package com.zzxx.charStream;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class Demo02BufferedStream {
    @Test
    public void test01() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("a.txt"), "gbk"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
    @Test
    public void test02() throws IOException {
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("a.txt", true), "gbk"), true);
        pw.print("?");
        pw.println();
        pw.println("没有");

//        pw.flush();
    }
    @Test
    public void test03() throws IOException {
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("a.txt", true), "gbk"), true);

        pw.print("你怎么还不找!");
        pw.print("都多大人了!");
        pw.flush();
    }
}
