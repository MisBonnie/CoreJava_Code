package com.zzxx.shoot;

/*
大敌机
 */
public class BigPlane extends FlyingObject implements Enemy, Award {
    private int speed;
    private int score;
    private int awardType;
    public BigPlane() {
        super((int) (Math.random() * (Main.WIDTH-Main.bigplane.getWidth())),
                - Main.bigplane.getHeight(),
                Main.bigplane, 4);
        speed = 1;
        score = 10;
        awardType = (int) (Math.random() * 2);
    }

    @Override
    public void move() {
        // y坐标变大
        setY(getY() + speed);
    }

    public int getScore() {
        return score;
    }

    @Override
    public int getAwardType() {
        return awardType;
    }
}
