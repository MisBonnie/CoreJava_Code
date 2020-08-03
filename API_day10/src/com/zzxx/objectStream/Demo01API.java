package com.zzxx.objectStream;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class Demo01API {
    @Test
    public void test01Init() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
    }

    @Test
    public void test02Write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

        Date date = new Date();
        oos.writeObject(date);

        String str = "hello";
        oos.writeObject(str);

        oos.writeObject(null);

        oos.close();
    }

    @Test
    public void test03Read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

        Date d = (Date) ois.readObject();
        System.out.println(d);

        String s = (String) ois.readObject();
        System.out.println(s);
        // 没有对象了, 读出来的是 EOFException  End Of File
        Object o = ois.readObject();
        System.out.println(o);
    }
}
