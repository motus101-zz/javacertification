package com;

public class MyApp {
    public static void main(String[] args) {
        int age = 0;
        OTHER:
        while (age++ <= 16) {
//            age++;
            if (age == 16) {
                System.out.printf("Get your license your age - %d!\n", age);
                continue OTHER;
            } else if (age > 16) {
                break OTHER;
            } else {
                System.out.printf("Another year your age - %d!\n", age);
            }
        }
        System.out.println("End of the loop!");
    }
}