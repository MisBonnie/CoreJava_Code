package com.zzxx.homework;

/**
 * 酒店类
 */
public class Hotel {
    // -- 成员变量
    // 很多个房间
    Room[][] rooms = new Room[8][6];
    // 1001  1002~ 1006
    // 2001 ~ 2006 8006
    Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room((i+1)*1000+j+1);
            }
        }
    }

    // -- 成员方法 - 功能
    // 入住 1001 lucy  rooms[0][0]
    void in(int roomNum, String name) {
        int i = roomNum / 1000 - 1;
        int j = roomNum % 1000 - 1;
        // 设置对应的房间顾客为 name 构造出来的Guest对象
        rooms[i][j].guest = new Guest(name);
        System.out.println(name + "成功入住" + roomNum);
    }
    // 退房
    void out(int roomNum) {
        int i = roomNum / 1000 - 1;
        int j = roomNum % 1000 - 1;
        rooms[i][j].guest = null;
        System.out.println(roomNum + "成功退房");
    }
    // 查房
}
