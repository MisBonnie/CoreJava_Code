package com.zzxx.relationship;

public interface InterfaceB {
    void methodAbsA();

    default void methodDefaultA() {
        System.out.println("InterfaceB methodDefaultB");
    }
}
