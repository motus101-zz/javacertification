package com;

public class MyApp {
    public int i = 0x3d;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.go(app.i);
        System.out.println("hi " + app.i);
    }

    void go(int x) {
        for (int j = 0; j < 3; ) {
            x = ++j;
        }
        System.out.println(x);
    }
}