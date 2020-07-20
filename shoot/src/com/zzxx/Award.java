package com.zzxx;

/*
奖励类型: 实现类 - 小蜜蜂\大敌机\...
 */
public interface Award {
    int DOUBLE_FIRE = 0;
    int ADD_LIFE = 1;

    int getAwardType();
}
