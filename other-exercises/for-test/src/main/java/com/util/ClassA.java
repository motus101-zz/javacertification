package com.util;

public class ClassA implements SomeInterface {
    public short a = 42;

    public void printStaticMemb() {
        System.out.println(SomeInterface.a1);
    }
    public void printM() {
        System.out.println("Hi from super class!");
    }

    public int getA() {
        return a;
    }
}