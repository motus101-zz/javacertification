package com;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        doMapReduce();
    }

    public static void doMapReduce() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 5, 4, 8, 6, 7);
        System.out.println(arr.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .findFirst()
        );

    }
}