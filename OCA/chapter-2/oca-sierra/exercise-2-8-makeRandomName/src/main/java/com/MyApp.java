package com;

public class MyApp {
    static {
        System.out.println("From static init block");
    }

    {
        System.out.println("From init block");
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[]{"Fluffy", "Fido",
                "Rover", "Spike",
                "Gigi"}[x];
        return name;
    }

    public static void main(String[] args) {
        MyApp app1 = new MyApp();
        MyApp app2 = new MyApp();

        System.out.println(app1.makeRandomName());
        System.out.println(app2.makeRandomName());
    }
}
