package com;

public class StringTest {
    public static void main(String... args) {
        String text = "Hi there!";
        String result = text.substring(0, 5).toLowerCase();
        boolean is = result.startsWith("h");
        if (is) {
            result = result.replaceFirst(result.substring(0, 1), "H");
        }
        System.out.println(is);
        System.out.println(result);
    }
}