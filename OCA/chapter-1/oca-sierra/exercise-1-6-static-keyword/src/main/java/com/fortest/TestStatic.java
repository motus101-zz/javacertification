package com.fortest;

public class TestStatic {
    public static String text = "For test!";
    private String name = "Bob";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}