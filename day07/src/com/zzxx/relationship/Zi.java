package com.zzxx.relationship;

/*
    一个类一定有唯一的父类, 可以有多个父接口
    1.实现多个接口, 将这些接口中所有的抽象方法都实现掉
    2.父类中有抽象方法, 也要实现掉
    3.如果多个接口中,有重复的抽象方法,实现一次即可
    4.如果多个接口中,有重复的default方法,必须要重写一个
 */
public class Zi extends Fu implements InterfaceA, InterfaceB {
    @Override
    public void methodAbsC() {

    }

    @Override
    public void methodAbsA() {

    }

    public void methodZi() {

    }
    public void methodDefaultA() {

    }
}
