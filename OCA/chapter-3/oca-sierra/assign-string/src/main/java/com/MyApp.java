package com;

public class MyApp {
    private String a = "String";
    private String b = "String";

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.concatenation();
    }

    void concatenation() {
        System.out.println("b" + 'a' + 100);
        System.out.println(new Integer(100) + 'a');

        Integer i = 6;
        System.out.println(i);
    }

    void checkEqual(String a1, String b1) {
        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println("str1 == str2  is - " + (str1 == str2));
        System.out.println("str1 equals str2  is - " + (str1.equals(str2)));

        System.out.println("a == b  is - " + (a1 == b1));
        System.out.println("a.replace(g,g) == b  is - " + (a1.replace('g', 'g') == b1));
        System.out.println("a.replace(g,g) == b.replace(g,g)  is - " + (a1.replace('g', 'g') == b1.replace('g', 'g')));
        System.out.println("a.replace(g,G) == b.replace(g,G)  is - " + (a1.replace('g', 'G') == b1.replace('g', 'G')));
        System.out.println("a.replace(g,G) == StrinG)  is - " + (a1.replace('g', 'G') == "StrinG"));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MyApp{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}