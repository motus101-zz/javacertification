package com;

import com.fortest.*;

public class MyApp {
    public static void main(String[] args) {
        Dog dog;
        if (args.length > 0) {
            dog = new Dog(args[0]);
        } else {
            dog = new Dog();
        }
        System.out.println(args.length);
        System.out.println(dog.getName());
    }
}