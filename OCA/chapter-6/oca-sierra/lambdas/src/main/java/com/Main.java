package com;

import java.util.function.*;
import java.util.*;


public class Main {

    public static void main(String... args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.forEach(e -> {if (e % 2 == 0 ) System.out.println(e);});

        playWithLambdaTwo(list, e -> e % 2 != 0);
    }

    public static void playWithLambdaTwo(List<Integer> ints, Predicate<Integer> predicate) {
        for (Integer i : ints){
            if (predicate.test(i)) {
                System.out.println(i + " second iteration");
            }
        }
    }

}