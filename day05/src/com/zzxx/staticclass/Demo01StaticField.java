package com.zzxx.staticclass;

public class Demo01StaticField {
    static {
        System.out.println("加载图片资源");
    }
    public static void main(String[] args) {
        System.out.println("主方法开始");
        Child c1 = new Child("小明", 3);
        System.out.println(Child.money);
        /*Child c1 = new Child("小明", 3);
        Child c2 = new Child("小豪", 4);

        System.out.println(Child.money);
        Child.money -= 100;
        System.out.println(Child.money);*/

    }
}
