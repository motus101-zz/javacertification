package com;

import java.util.Arrays;

public class MyApp {
    static int[] arr = new int[50];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length;) {
            arr[i] = ++i;
        }
        System.out.println(
//                Arrays.stream(arr).forEach(System.out::println)
        );
//        firstVariant(arr);
        secondVariant(arr);
    }

    static void firstVariant(int[] ints) {
        for (int anInt : ints) {
            if ((anInt % 3 == 0) && (anInt % 5 == 0)) {
                System.out.printf("Both. The nymber is %d \n", anInt);
            } else if (anInt % 5 == 0) {
                System.out.printf("Divisid by 5 and number is %d \n", anInt);
            } else if (anInt % 3 == 0) {
                System.out.printf("Divisid by 3 and number is %d \n", anInt);
            } else {
                System.out.printf("No one. The nymber is %d \n", anInt);
            }
        }
    }

    static void secondVariant(int[] ints) {
        Arrays.stream(ints)
                .filter(i -> ((i % 5 == 0) && (i % 3 == 0)))
                .forEach(System.out::println);
    }
}