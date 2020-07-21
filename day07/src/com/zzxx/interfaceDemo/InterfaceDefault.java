package com.zzxx.interfaceDemo;

public interface InterfaceDefault {
    void methodAbs1();

    public default void defaultMethod() {
        System.out.println("Default A");
    }
}
