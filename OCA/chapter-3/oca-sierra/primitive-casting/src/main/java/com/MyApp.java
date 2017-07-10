package com;

public class MyApp {
    private byte aByte = 120;
    private short aShort = 32000;
    private int anInt = 200000;
    private long aLong = 8890099;

    private float aFloat = 127.2F;
    private double aDouble = 127.3;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.aByte = 120 + 5;
        System.out.println(app.toString());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyApp{" +
                "aByte=" + aByte +
                ", aShort=" + aShort +
                ", anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                '}';
    }
}