package com;

import com.foo.*;

public class MyApp extends Buzz {
    private String string = "Hi";
    protected int anInt = 42;
    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println(app.string);
        System.out.println(app.anInt);
        System.out.println(app.int1);


        app.doBuzzStuff();
        app.doMyapp();
    }

    public void doMyapp() {
        System.out.println(string);
    }
}