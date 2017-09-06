package com.util;

import java.util.*;

public class ArrayUtil {
    public static void fillArray(int[][] ints) {
        Random r = new Random();
        for (int[] ints1 : ints) {
            for (int i = 0; i < ints1.length; i++) {
                ints1[i] = r.nextInt(20);
            }
        }
    }

    public static void printArray(int[][] ints) {
        for (int[] ints1 : ints) {
            System.out.println(Arrays.toString(ints1));
        }
    }
}