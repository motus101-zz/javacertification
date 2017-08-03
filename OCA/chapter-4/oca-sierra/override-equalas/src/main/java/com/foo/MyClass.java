package com.foo;

public class MyClass {
    private int number;
    private String text;
    private char aChar;

    public MyClass(int i, String s, char c) {
        this.number = i;
        this.text = s;
        this.aChar = c;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "MyClass{" +
                "number=" + number +
                ", text='" + text + '\'' +
                ", aChar=" + aChar +
                '}';
    }
}