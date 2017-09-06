package com;

public class Main {
    public static void main(String... args) {
        doStuff(6, 0);
    }

    private static void doStuff(int a, int b) {
        assert (b > 0) : "Second argument less than or equel 0 " + b;
        System.out.println("The result is - " + (a / b));
    }
}