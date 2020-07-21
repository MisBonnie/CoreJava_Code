package com.zzxx.loop;

public class Demo03While {
    public static void main(String[] args) {
        //
        /*for (int i = 1; i <= 10; i++) {
            // for循环体
        }*/
        /*int i = 1;
        while(i <= 10) {
            // while循环体
            i++;
        }*/
        // 从1开始相加, 加到结果超过500为止
        int i = 1; // 要加的数,变化的
        int sum = 0; // 用来记录结果的
        while(sum <= 500) {
            sum += i;
            i++;
        }
        System.out.println("超过500时, i是:" + i);
        System.out.println("超过500时, sum是:" + sum);
    }
}
