package com;

import com.foo.*;

public class MyApp {
    private char aChar = 'a';
    private byte aByte = 12 + 7;
    private short aShort = 45 + 45;
    private int anInt = 172;
    private long aLong = 1_000_000_000_000L;

    private float aFloat = -2 * (float)1.5;
    private double aDouble = -3_000;

    private String string = "String";

    public static void main(String[] args) {
        MyApp app = new MyApp();

        SomeClass sc = new SomeClass();
        float b = sc.getA();
        System.out.println(b);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyApp{" +
                "aChar=" + aChar +
                ", aByte=" + aByte +
                ", aShort=" + aShort +
                ", anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }
}