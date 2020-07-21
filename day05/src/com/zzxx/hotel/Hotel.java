package com.zzxx.hotel;

public class Hotel {
    Room[][] rooms;

    Hotel() {
        rooms = new Room[8][6];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room((i + 1) * 1000 + j + 1);
            }
        }
    }

    void in(int roomNum, String name) {
        int i = roomNum / 1000 - 1;
        int j = roomNum % 1000 - 1;
        if (rooms[i][j].guest != null){
            System.out.println("该房间已有人, 请重新选择!");
            return;
        }
        rooms[i][j].guest = new Guest(name);
        System.out.println("入住成功, 房间号: " + roomNum);
    }

    void out(int roomNum) {
        int i = roomNum / 1000 - 1;
        int j = roomNum % 1000 - 1;
        if (rooms[i][j].guest == null) {
            System.out.println("该房间未住人!");
            return;
        }
        rooms[i][j].guest = null;
        System.out.println("退房成功");
    }
    void show() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].roomNum + "\t");
            }
            System.out.println();
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].guest != null) {
                    System.out.print(rooms[i][j].guest.name + "\t");
                } else {
                    System.out.print(rooms[i][j].guest + "\t");
                }
            }
            System.out.println();
        }
    }
}
