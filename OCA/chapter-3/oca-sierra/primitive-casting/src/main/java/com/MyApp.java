package com;

import com.foo.*;

public class MyApp {
//  dec
    private char aChar = 'a';
    private byte aByte = 127;
    private short aShort = (short)(aByte + 45);
    private int anInt = 172;
    private long aLong = 1_000_000_000_000L;
//  float
    private float aFloat = 1.5f;
    private double aDouble = -3_000;
//  string
    private String string = "String";

    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println(app.toString());
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