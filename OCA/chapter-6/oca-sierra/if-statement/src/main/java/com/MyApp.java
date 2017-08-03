package com;

public class MyApp {
    public static void main(String[] args) {
        String s = "null";
        if (s == null)
            System.out.println("s is null");
        else
            System.out.printf("Name of class is %s \n", s.getClass().getName());
    }
}