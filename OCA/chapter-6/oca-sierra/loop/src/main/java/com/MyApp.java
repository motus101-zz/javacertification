package com;

public class MyApp {
    public static void main(String[] args) {
        int age = 0;
        other:
        while (age <= 21) {
            age++;
            if (age == 16) {
                System.out.printf("Get your license your age - %d!\n", age);
                continue other;
            } else {
                System.out.printf("Another year your age - %d!\n", age);
            }
        }
        System.out.println("End of the loop!");
    }
}