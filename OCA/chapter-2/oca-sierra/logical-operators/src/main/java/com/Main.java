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
        int i = 10;
        int b = 42;
        // Primitives
        if ((i < 11) | (++b > 42)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Objects
        if (m == m2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // String
        if (st1 != st2)
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println("True anyway");
    }
    public void doSomething() {

    }
}