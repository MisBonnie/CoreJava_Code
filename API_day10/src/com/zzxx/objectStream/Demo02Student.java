package com.zzxx.objectStream;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class Demo02Student {
    @Test
    public void test01Write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.obj"));

        Student s = new Student();
        s.setName("杨幂");
        s.setAge(38);
        s.setSex('女');
        // NotSerializableException
        oos.writeObject(s);

        oos.close();
    }

    @Test
    public void test02Read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.obj"));

        // NotSerializableException
        Student s = (Student) ois.readObject();

        ois.close();
        System.out.println(s);
    }
}
