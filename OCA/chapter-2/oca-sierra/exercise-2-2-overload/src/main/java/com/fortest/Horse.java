package com.fortest;

public class Horse extends Animal {
    public void doSomeThings() {
        System.out.println("Out form Horse");
    }
    public void checkFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I is - " + i);
            for (int j = i; j < 10; j++) {
                System.out.println("Second for I is - " + i);
                System.out.println("J is - " + j);
            }
        }
    }
}