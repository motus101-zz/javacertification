package com;

import java.util.Random;

public class Main {
    public static void main(String... args) {
        int[][] arr = new int[6][10];
        int count = 0;
        Main m = new Main();
        m.fillArr(arr);
        m.findNumber(arr, 10);
        FIRST:
        for (int[] a1 : arr) {
            System.out.println("This is - " + ++count + " iteration");
            SECOND:
            for (int i : a1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public void fillArr(int[][] array) {
        Random random = new Random();
        for (int[] a1 : array) {
            for (int i = 0; ++i <= a1.length; ) {
                a1[i - 1] = random.nextInt(42);
            }
        }
    }

    public void findNumber(int[][] arr, int number) {
        int firstIndex = 0;
        FIRST:
        for (int[] array : arr) {
            firstIndex++;
            for (int secondIndex = 0; secondIndex < array.length; secondIndex++) {
                if (array[secondIndex] == number) {
                    System.out.println("Number has found at position [" + firstIndex + "][" + ++secondIndex + "]");
                    break FIRST;
                }
            }
            System.out.println("Still can't find the number - " + number);
        }
    }
}