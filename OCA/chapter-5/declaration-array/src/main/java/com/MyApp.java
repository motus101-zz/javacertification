package com;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[96];
        for (int i = 0, x = 31; i < arr2.length; i++) {
            arr2[i] = ++x;
        }
        int[] arr3 = new int[]{11, 22, 33, 44, 55, 66, 77};
        int[] arr4 = new int[10];
        for(int i = 0; i < arr4.length;) {
            arr4[i] = ++i;
        }
        String[] arrSt = new String[5];
        for (String string : arrSt) {
            System.out.println(string);
        }

        char[] arr5 = {0x4e, '\u004e', 78};
        for (char c : arr5) {
            System.out.println(c);
        }
        printArray(arr4);
    }

    static void printArray(int[] ints) {
        Arrays.stream(ints)
//                .mapToObj(i -> (char) i)
                .forEach(System.out::println);
    }
}