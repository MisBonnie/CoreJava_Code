package com.zzxx.e_ThisMethodReference;

public class Husband {
    public void buyHouse(String str) {
        System.out.println("在" + str + "买了一套三居室");
    }
    public void marry(String str, Richable ric) {
        ric.buy(str);
    }
    public void show() {
        /*marry("北京三环内", s->{
            this.buyHouse(s);
        });*/
        /**
         * this 已经存在
         * buyHouse 已经存在
         */
        // 方法引用优化
        marry("北京三环内", this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().show();
    }
}
