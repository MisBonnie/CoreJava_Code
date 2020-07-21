package com.zzxx.oop;

public class Demo03ReferenceArray {
    public static void main(String[] args) {
        // 基本数据类型数组
        int[] arr = {1, 2, 3, 4};
        char[] arr2 = {'h', 'a', 'h', 'a'};
        // 默认值0
        int[] arr3 = new int[3];
        // 引用类型数组
        Student[] arr4 = {new Student(), new Student()};
        // 默认值 null
        Student[] arr5 = new Student[3];
        System.out.println(arr5[0]); // null
        // 要给第一个student对象, 修改name值为 "小俊"
//        arr5[0].name = "小俊";
//        arr5[0].study("java");
        arr5[0] = new Student("小明", 21, null);
        arr5[0].name = "小俊";
        System.out.println(arr5[0].name);
    }
}
