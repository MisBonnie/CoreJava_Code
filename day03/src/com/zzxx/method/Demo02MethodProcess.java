package com.zzxx.method;

/**
 * 方法的执行过程
 */
public class Demo02MethodProcess {
    public static void main(String[] args) {
        // 调用方法
        int a = 4;
        int b = 6;
        int c = sum(a, b);
        System.out.println(c);
    }
    /*
        计算两个整数的和, 并且返回
     */
    public static int sum(int a, int b) {
        int sum = a + b;
        a ++;
        return sum;
    }
}
