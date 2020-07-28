package com.zzxx.exception;

import java.io.IOException;
import java.text.ParseException;

// 手动抛出异常
public class Demo05 {
    // 主方法向外抛出异常, 是抛给JVM, JVM接收到异常, 中断处理
    public static void main(String[] args) throws ParseException {
//        try {
        // 会产生一个ParseException, 属于已检查异常, 必须处理
            method1();
//        } catch (ParseException e) {
//        }
    }
    // method1方法声明了异常信息, 那么调用这个方法的时候就会可能产生一个声明的异常
    // throws声明异常, 等同于将异常抛给调用者来处理
    public static void method1() throws ParseException {
        // 已检查异常 - 必须要处理
        // 第一种处理方式: try-catch
        try {
            throw new IOException("IO异常是因为什么产生的");
        } catch (IOException e) {
        }
        // 第二种处理方式: 在方法声明上添加 throws 声明
        throw new ParseException("这是格式错了", 0);
        // 运行时异常
//        throw new NullPointerException("对象是null");
//        throw new RuntimeException("这个运行时异常是你代码哪里写错了");
    }
}
