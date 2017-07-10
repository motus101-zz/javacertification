package com;

public class MyApp {
    static int i = 42;
    public static void main(String[] args) {
        new MyApp().go(i);
        System.out.println("hi "+i);
    }

    void go(int x) {
        for (int j = 0; j < 3; j++) {
            int x = ++j;
        }
        System.out.println(x);
    }
}