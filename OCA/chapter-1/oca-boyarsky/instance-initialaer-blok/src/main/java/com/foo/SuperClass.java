package com.foo;

public class SuperClass {
    private String s;
    static {
        System.out.println("From superclass static blok!");
    }
    public SuperClass() {
        System.out.println( this + " from superclass");
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "s='" + s + '\'' +
                '}';
    }
}