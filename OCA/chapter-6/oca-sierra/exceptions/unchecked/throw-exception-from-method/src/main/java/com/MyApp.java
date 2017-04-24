package com;

import java.lang.*;

public class MyApp {
    private int age;

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.setAge(2);
    }

    public void setAge(int age) {
        if (age <= 20) throw new IllegalArgumentException("# The age should be more than 20");
        this.age = age;
    }
}