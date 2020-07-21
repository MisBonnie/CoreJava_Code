package com.zzxx.array;

/**
 * 数组的初始化讲解
 * 1.数组的类型是固定的, 只能存相同类型的数据
 * 2.数组一旦确定, 数组的长度是不可变的
 * 3.数组长度获取: arr.length
 * 4.访问数组中的元素, 通过下标/索引 index
 *   数组索引从0开始, 到 length-1 结束
 *   如果超过索引范围: ArrayIndexOutOfBoundsException
 *                  数组下标越界异常
 */
public class Demo01Init {
    public static void main(String[] args) {
        // 数组的声明
        int[] arr;
        // 数组的初始化: 一共3种方式
        // 方式一: 在声明的同时初始化, 已经确定数组内容
        int[] arr1 = {1, 2, 3, 4};
        // 不能使用方式一再次赋值
//        arr1 = {2, 3, 4, 5}; // 编译错误
        // 方式二: 在声明的同时初始化, 已经确定数组内容
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        // 使用方式二可以再次赋值
        arr2 = new int[]{3, 4, 5, 6, 7, 8, 9};

        // 方式三: 在声明的同时初始化, 只能确定长度, 内容全部都是默认值
        // 默认值: 整数-0, 浮点-0.0, char-\u0000, boolean-false
        int[] arr3 = new int[5];
        // 通过遍历, 将数组元素赋值成 {10, 20, 30, 40, 50}
        System.out.println(arr1.length);
        System.out.println(arr3[4]);
        arr1[0] = 2;
        System.out.println(arr1[0]);
        System.out.println(arr1);// [I@2471cca7 -> 地址
        double[] arr4 = new double[2];
        System.out.println(arr4); // [D@5fe5c6f

        // 迭代/遍历 数组
    }
}
