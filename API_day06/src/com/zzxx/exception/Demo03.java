package com.zzxx.exception;

// try-catch-finally
public class Demo03 {
    public static void main(String[] args) {
        try {
            ArraysDemo.m1(); // 这里会出现越界异常
            System.out.println("m1方法正常结束");

            NullPointerDemo.m2(); // 可能会产生空指针异常
            System.out.println("m2方法正常结束");

            ClassCastDemo.m3(); // 可能会出现类型转换异常
            System.out.println("m3方法正常结束");
            return;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            // 可以一次捕获多种异常, 统一处理
            System.out.println("捕获到异常了");
            System.out.println("异常来了, 执行B方案");
            System.out.println("B方案 好像也挺成功的");
            System.out.println("B方案 执行结束了, 任务完成了");
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到异常了");
            System.out.println("异常来了, 执行B方案");
            System.out.println("B方案 好像也挺成功的");
            System.out.println("B方案 执行结束了, 任务完成了");
        }*/ catch (RuntimeException e){
            System.out.println("捕获到运行时异常了");
        } finally {
            System.out.println("finally 代码块");
        }
    }
}
