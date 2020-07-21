package com.zzxx.override;

import java.util.ArrayList;

/*
    1.子类中的方法名和参数列表要和父类中一致
      @Override 检测这个方法是不是重写, 方法语法不符合重写, 就会报错
      如果语法符合, 没有加@Override, 也属于重写
    2.子类中的权限, [大于等于] 父类中的方法权限
    3.子类中的返回值, [小于等于] 父类中的返回值类型
      引用类型 小于等于: Zi -> Fu -> Object   Fu->Zi(×)
      基本数据类型, 只能相同
      Fu fu = new Zi(); // √
      Zi zi = new Fu(); // ×
    4.异常
 */
public class Zi extends Fu {
    @Override
    public int m1() {
        return 0;
    }

    protected long m2() {
        return 0;
    }
    @Override
    public ArrayList m3() {
        return null;
    }
//    @Override
    // 类方法, 不存在重写的概念
//    public static void m5() {
//
//    }
}
