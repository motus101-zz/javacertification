package com;

import com.foo.*;

public class Main {
    public static void main(String... args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent ph = new Child();
        String[] strings = new String[3];
        strings[0] = "ho ho ho";

        if (strings[0] instanceof String) {
            System.out.println(" a instance of b");
        } else {
            System.out.println(" a is not instance of b");
        }


    }
}