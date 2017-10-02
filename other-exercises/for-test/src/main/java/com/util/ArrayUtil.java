package com.util;

import java.util.*;

public class ArrayUtil {
    public int[][] fillArray(int[][] ints) {
        Random r = new Random();
        for (int[] ints1 : ints) {
            for (int i = 0; i < ints1.length; i++) {
                ints1[i] = r.nextInt(20);
            }
        }
        return ints;
    }

    public int[] fillArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }

    public int[] getRandomArray() {
        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }
    public static void printArray(int[][] ints) {
        for (int[] ints1 : ints) {
            System.out.println(Arrays.toString(ints1));
        }
    }
}