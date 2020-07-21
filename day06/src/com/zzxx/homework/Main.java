package com.zzxx.homework;

public class Main {
    public static void main(String[] args) {
        // 程序开始
        System.out.println("欢迎进入酒店管理系统!");
        Hotel hotel = new Hotel();
        // com.zzxx.homework.Room@6979e8cb
        System.out.println(hotel.rooms[3][4].num);

        hotel.in(2003, "lucy");
        hotel.out(2003);
    }
}
