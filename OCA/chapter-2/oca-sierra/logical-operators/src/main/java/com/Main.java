package com;

public class Main {
    public static void main(String... args) {
        // Objects
        Main m = new Main();
        Main m1 = new Main();
        Main m2 = m;
        String st1 = "Hi!";
        String st2 = "Hi!";

        // Primitives

        short sh = 255;
        int i = 255;
        int b = 42;

        Integer aInt = i;
        Boolean bl = aInt instanceof Number;
        System.out.println(bl);

        long l = 3_0000;
        float f = 255.000f;

        if (i == b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (sh == f) {
            System.out.println("True float");

        } else {
            System.out.println("False");
        }

    }

    public void doSomething() {

    }
}