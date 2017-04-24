package com;
import java.util.Arrays;

public class MyApp {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] arr1 = new int[10];

    public static void main(String[] args) {
        System.arraycopy(arr, 2, arr1, 4, 3);
        Arrays.stream(arr1)
                .forEach(System.out::println);
    }
}