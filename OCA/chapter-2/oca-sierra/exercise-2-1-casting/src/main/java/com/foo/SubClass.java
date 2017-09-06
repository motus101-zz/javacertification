package com.foo;

public class SubClass extends SuperClass {
    public void doSubClassStuff() {
        System.out.println("Hi from SubClass!");
    }
    public void doSuperClassStuff() {
        System.out.println("Override superclass method!");
    }
    public void myMethod() {
        System.out.println("My method!");
    }
}