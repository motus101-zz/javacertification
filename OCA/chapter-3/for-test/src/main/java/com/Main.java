package com;

public class Main {
    public static void main(String... args) {
        String a = "";
        a += "For ";
        a += "test";
        String c = "For test";
        StringBuilder b = new StringBuilder(c);

        System.out.println("_____");
//        ---
        if (a == "For test") {
            System.out.println(" a == For test");
        } else {
            System.out.println(" a != For test");
        }
//        ---
        if (c.equals("For test")) {
            System.out.println("c equals For test");
        } else {
            System.out.println("c don't equals For test");
        }
//        ---
        if (c.equals(b)) {
            System.out.println("c equals b");
        } else {
            System.out.println("c don't equals b");
        }
    }
}