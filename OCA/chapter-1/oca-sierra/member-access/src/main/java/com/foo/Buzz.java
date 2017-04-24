package com.foo;

public class Buzz extends Bar {
    protected int int1 = 1000;
    public void doBuzzStuff() {
        System.out.printf("Protected members from Bar are - %d and - %s \n", anInt, string);
    }
}