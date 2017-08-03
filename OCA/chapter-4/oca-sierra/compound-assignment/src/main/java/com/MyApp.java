package com;

public class MyApp {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.testCompare();
    }

    void testCompound(int a, int b) {
        a += a++ + 5 * 8 + a;
        b -= 1;
        System.out.printf("A is %d and B is %d \n", a,b);
    }

    void testCompare() {
        String a = "Test";

        System.out.println("Test" == a);
    }
}