package com.foo;

public abstract class MyAbstractClass {
    public abstract void doGeneralThings();

    public void doConcreteThings() {
        System.out.println("Hi from concrete method!");
    }

    public static void staticMethod() {
        System.out.println("static method from abstract class");
    }
}