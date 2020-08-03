package com.zzxx.charStream;

import org.junit.Test;

import java.io.*;

public class Demo01API {
    @Test
    public void write01() throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("a.txt"));
        // 写入单个字符
        // 11111111 11111111
        w.write(-1); // 65535
        w.write(97); // a
        w.write('你');

//        w.flush();
        w.close();
    }
    @Test
    public void write02() throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("a.txt"));
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        w.write(ch);
        w.write('\n');
        w.write("hello");
//        w.flush();
        w.close();
    }
    @Test
    public void write03() throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("a.txt"));
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        w.write(ch, 2, 3); // llo
        w.write("\n");
        w.write("hello", 1, 4);
//        w.flush();
        w.close();
    }
    @Test
    public void read01() throws IOException {
        Reader r = new InputStreamReader(new FileInputStream("a.txt"));
        int c = r.read();
        System.out.println(c);
    }
    @Test
    public void read02() throws IOException {
        Reader r = new InputStreamReader(new FileInputStream("a.txt"));
        char[] ch = new char[10];
        int len = r.read(ch);
        System.out.println(len);
        System.out.println(ch);
    }
}
