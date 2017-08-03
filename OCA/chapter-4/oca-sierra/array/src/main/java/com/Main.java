package com;

import java.util.*;

public class Main {
    public static void main(String... args) {
        String test = new String("aBcD");
        System.out.println(test.substring(1, 4).toUpperCase());
        System.out.println(test.charAt(4));
    }

    public static void fillArray(int[][][] ints) {
        Random random = new Random();
        for (int[][] ints1 : ints) {
            for (int[] ints2 : ints1) {
                for (int i = 0; i < ints2.length; i++) {
                    ints2[i] = random.nextInt(10);
                }
            }
        }
    }
}