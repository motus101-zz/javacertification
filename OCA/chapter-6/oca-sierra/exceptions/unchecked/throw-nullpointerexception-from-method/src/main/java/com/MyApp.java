package com;

public class MyApp {
    private String string;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.printLength(app.string);
    }

    public void printLength(String s) throws java.lang.NullPointerException {
        System.out.println(s.length());
    }
}