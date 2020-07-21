package com.zzxx.relationship;

public interface InterfaceA {
    void methodAbsA();

    default void methodDefaultA(){
        System.out.println("InterfaceA methodDefaultA");
    }
}
