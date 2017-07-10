package com;

import com.foo.*;

public class MyApp {
    private byte b = 127;
    private int i = 500000;
    private long aLong = 9_223L;
    private float f = 125.12_5f;
    private double d = 42000.50;
    private char aChar = 65535;
    private float test = aLong;

    public static void main(String[] args) {
        SizeOfLiter sizeOfLiter = new SizeOfLiter();
        MyApp app = new MyApp();
        System.out.println(app.toString());
//        System.out.println(sizeOfLiter.toString());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyApp{" +
                "test=" + test +
                ", b=" + b +
                ", i=" + i +
                ", aLong=" + aLong +
                ", f=" + f +
                ", d=" + d +
                ", aChar=" + aChar +
                '}';
    }
}