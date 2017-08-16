package com;

public class Main {
    public static void main(String... args) {
        int[][] array = new int[][]{{1, 7, 2}, {5, 42, 10}, {12, 11, 32}};
        testForLoop(20);
        testBreakContinue(array);
        System.out.println("Exit!");
    }

    static void testForLoop(int i) {
        FIRST:
        for (int j = 0; ++j < i; ) {
            if (j == 10)
                return;
            System.out.println("J - is " + j);
        }

        System.out.println("Second");
    }

    static void testBreakContinue(int[][] arr) {
        int count = 0;
        INNER:
        for (int[] ints : arr) {
            System.out.println("Loop - " + ++count);
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 7) break;
                if (ints[i] == 42) break;
                System.out.println("Inner loop. Number - " + ints[i]);
            }
        }
    }
}