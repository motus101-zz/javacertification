package com;

public class MyApp {

    public static void main(String[] args) {
        if (args.length == 1 || args[1].equals("test")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}