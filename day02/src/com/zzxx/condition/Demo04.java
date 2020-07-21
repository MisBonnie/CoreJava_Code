package com.zzxx.condition;// 课堂案例：
/*
	用户自己输入：商品单价50、和商品数量12
	输入：实付金额600
	如果：应付金额>500，打8折
	输出：找零金额120

	升级版: 判断实付金额够不够
*/

import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入商品单价：");
        int price = console.nextInt();
        System.out.println("请输入商品数量：");
        int count = console.nextInt();
        System.out.println("请输入实付金额：");
        double money = console.nextInt();
        // 应付金额
        double sum = price * count;
        if (sum >= 500) {
            // 打8折
            sum = sum * 0.8;
        }

        if (money >= sum) {
            System.out.println("找零：" + (money - sum));
        } else {
            System.out.println("钱不够");
        }
    }
}




