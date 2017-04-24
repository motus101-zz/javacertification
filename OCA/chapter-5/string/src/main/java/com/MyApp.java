package com;

public class MyApp {
    public static void main(String[] args) {
        testString();
    }

    static void testString() {
        String st = "  Try to show your best!";
        System.out.printf("Out is - %s \n", st.trim());
    }
}