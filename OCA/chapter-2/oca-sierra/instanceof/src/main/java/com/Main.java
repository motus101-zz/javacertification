package com;

import java.io.IOException;

class Main {
    public static void main(String... args) {
        Child ch1 = new Child();
        Child ch2 = new Child();
        Parent ch3 = new Child();

        if (ch1.equals(ch3)) {
            System.out.println("Equals");
        } else {
            System.out.println("Doesn't equals");
        }

        if (ch1 instanceof Parent) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
            ch3.myStaticMethod();
    }
}