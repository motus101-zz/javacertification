package com;

public class MyApp {

    static int i = 42;

    public static void main(String[] arg) {
        String string = "FRED".toLowerCase().substring(1,3);
        System.out.println(string);
        doSwitch(string);
    }

    public static void doSwitch(String string) {
        String s = "JarJarBinks".toLowerCase();
        switch (string) {
            case "red":
                System.out.println("Case is 32");
            case "grean":
                System.out.println("Case is 42");
            case "re":
                System.out.println("Case is 12");
            case "bar":
                System.out.println("Case is 22");
            default:
                System.out.println("Switch is done");
        }
    }
}