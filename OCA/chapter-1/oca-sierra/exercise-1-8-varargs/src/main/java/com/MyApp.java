package com;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.doSomeStuff(1, 2, 4);
    }

    void doSomeStuff(Integer... ints) {
        List<Integer> arr = Arrays.asList(ints);
        if (arr.size() == 0) {
            System.out.println("No arguments");
        } else {
            System.out.printf("Size is %d \n", arr.size());
            arr.forEach(System.out::println);
        }
    }
}