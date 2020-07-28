package com.zzxx.exception;

// try-catch
public class Demo02 {
    public static void main(String[] args) {
        try {
            ArraysDemo.m1(); // 这里会出现越界异常
            System.out.println("m1方法正常结束");

            NullPointerDemo.m2(); // 可能会产生空指针异常
            System.out.println("m2方法正常结束");
        } catch (NullPointerException e){
            System.out.println("捕获到空指针了");
//            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到数组越界了");
            // 将异常出现的栈路径, 打印出来
            e.printStackTrace();
        } catch (RuntimeException e){

        }
        // 遇到未处理的运行时异常, 程序就直接终止了
        System.out.println("try-catch结束了");

        Object o = new String(); // ""
        Integer i = (Integer) o;
    }
}
