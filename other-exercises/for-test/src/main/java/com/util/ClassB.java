package com.util;

public class ClassB extends ClassA {
    public short a = 10;
    public static int a1 = 100;

    public int getA() {
        return a;
    }

    public void print() {
        System.out.println("Hi from subclass!");
    }

    public void staticMethod() {
        System.out.println("Static method from subclass");
    }

    public void checkExpr() {
        String result = 2 > 3 || 5 > 2 ? "true" : "false";
        System.out.println(result);
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "ClassB{" +
                "a=" + a +
                '}';
    }
}