package com.zzxx.hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner console = new Scanner(System.in);
        System.out.println("欢迎使用酒店管理系统!");

        loop:while (true) {
            System.out.println("请输入指令(show-查房,in-入住,out-退房,exit-退出系统):");
            String command = console.next();
            switch (command) {
                case "show":
                    hotel.show();
                    break;
                case "in":
                    System.out.println("请输入房间号和入住人姓名,例如(1001 张三):");
                    int num = console.nextInt();
                    String name = console.next();
                    hotel.in(num, name);
                    break;
                case "out":
                    System.out.println("请输入房间号:");
                    int roomNum = console.nextInt();
                    hotel.out(roomNum);
                    break;
                case "exit":
                    System.out.println("感谢使用,再见!");
                    break loop;
            }
        }
    }
}
