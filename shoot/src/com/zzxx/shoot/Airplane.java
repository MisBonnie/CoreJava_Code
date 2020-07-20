package com.zzxx.shoot;

/*
小敌机
 */
public class Airplane extends FlyingObject implements Enemy {
    private int speed;
    private int score;
    public Airplane() {
        super((int) (Math.random() * (400-Main.airplane.getWidth())),
                - Main.airplane.getHeight(),
                Main.airplane, 1);
        speed = 2;
        score = 5;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void move() {
        // y坐标变大
        setY(getY() + speed);
    }
}
