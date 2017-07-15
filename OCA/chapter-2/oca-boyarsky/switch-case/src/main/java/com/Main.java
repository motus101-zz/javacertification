package com;

public class Main {

    public static void main(String... args) {
        final int a = 42;
        final int b = 23;
        int check = 42;
        switch (check) {
            case a:
                System.out.println("A");
                break;
            case 5:
                System.out.println("Match");
                break;
            case b:
                System.out.println("B");
                break;
            default:
                System.out.println("Default");
        }
    }
}