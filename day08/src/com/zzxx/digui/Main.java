package com.zzxx.digui;

public class Main {
    public static void main(String[] args) {
        // 求 1~10的和
        // 求 10 的阶乘 = 10 * 9!
        // 9! = 9* 8!
        long resulet = jiecheng(10);
        System.out.println(resulet);
    }
    public static long jiecheng(int n) {
        // n * (n-1)! 自己调用自己的方法
        // 注意事项: 递归一定要有一个终止的条件
        if (n == 1){
            return 1;
        }
        long result = n * jiecheng(n-1);
        return result;
    } // 约瑟夫环

    /*
       0 0 0 1 0 0 0 0 0 0 -> 数组
       循环选择: while(在圈中的人数 != 1)
       变量a : if (a++ % 3 == 0) -> 出圈
       结果: 原来的位置
       出圈: 数组元素个数没变, 变的是标记
     */

}
