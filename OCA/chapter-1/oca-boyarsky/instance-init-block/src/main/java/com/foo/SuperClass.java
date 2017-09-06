package com.foo;

public class SuperClass {
    private String s;
    static {
        System.out.println("From SUPERCLASS STATIC blok!");
    }
    {
        System.out.println("From SUPERCLASS INSTANCE block!");
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