package com.fortest;

public abstract class MyAbstClass implements MyInterface {
    public abstract void doAbstClassStuff();

    public void checkOverridden() {
        System.out.println("Not yet overridden!");
    }
}