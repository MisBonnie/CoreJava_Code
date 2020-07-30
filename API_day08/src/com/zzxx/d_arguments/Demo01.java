package com.zzxx.d_arguments;

public class Demo01 {
    public static void main(String[] args) {
        sum(2, 4);
        sum(1,2,3,4,5);
        sum(1);
        sum();
        sum(1, 2, 3);
        sum(1, 2, 3, 4);

    }

    /*
        传入n个整数值, 将传入的整数相加求和, 并返回
     */
    /*public static int sum(int a, int b) {
        return a + b;
    }*/
    // JDK1.5之前, 不确定参数个数时, 就传入数组类型
    /*@Deprecated
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }*/
    /*
    JDK1.5后, 修改为可变长参数
    方法中, 除了可变长参数, 还有别的参数, 可变长参数必须放在参数列表最后
    而且一个方法中, 只能有一个可变长参数
     */
    public static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void method1(int a, String... ss) {

    }
}
