package com;

public class MyApp {
    public static void main(String[] args) {
        MyApp app = new MyApp();

        app.checkMod(3, 5);
    }

    void checkMod(int a, int b) {
        for (int i = 48; ++i < 50;) {
            if ((i % a == 0) && (i % b == 0)) {
                System.out.printf("Buzz and Bar %d \n", i);
            } else if (i % a == 0) {
                System.out.printf("Buzz %d \n", i);
            } else if (i % b == 0) {
                System.out.printf("Bar %d \n", i);
            } else {
                System.out.printf("Other %d \n", i);
            }
        }
    }
}