package com;

import com.foo.*;

public class MyApp {
    private byte b = 127;
    private float f = 125.125f;
    private double d = f;
    private int i = (int) d;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println(app.toString());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyApp{" +
                "i=" + i +
                ", b=" + b +
                ", f=" + f +
                ", d=" + d +
                '}';
    }
}