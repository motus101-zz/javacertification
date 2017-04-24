package com;

public class MyApp {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.doMyappStuff(4, 5);
        app.doCompare(10, 30);
    }

    void doMyappStuff(int a, int b) {
        a += 5 * 8;
        b -= 1;
        System.out.printf("A is %d and B is %d \n", a,b);
    }

    void doCompare(int a, int b) {
        boolean i = a > b;
        System.out.printf("The boolean i is - %s \n", i );
        if (i = true) {
            System.out.printf("The boolean I is - %s \n", i );

        }
    }
}