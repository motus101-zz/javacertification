package com;

import java.util.*;

public class Main {
    private List<Integer> list = new ArrayList<>();
    private Map<Integer, String> map = new HashMap<>();
    private int[][] multidementional_array = new int[][]{{1, 7, 2}, {5, 42, 10}, {12, 11, 32}};
    private int[] array = new int[10];

    public static void main(String... args) {
        Main main = new Main();
        main.testForLoop(main.multidementional_array);
        System.out.println("Done!");
    }

    public Main() {
        fillList(this.list);
    }

    public void testForLoop(int[][] array) {
        int i = 0;
        first:
        for (; i < array.length; i++) {
            for (int a : array[i]) {
                if (a == 12) break first;
                System.out.println(a);
            }
        }
        System.out.println("i is " + i);
        while (i >= 1) {
            if (i == 2) {
                System.out.println(i);
                break;
            }
            i--;
        }
    }

    public void testBreakContinue(List<Integer> list) {
    }

    public void testEnhancedFor(List<Integer> array) {
        for (Integer i : array) {
            System.out.println(i);
        }
    }

    private void fillList(List<Integer> list) {
        Random random = new Random();
        for (int count = 0; count < 10; count++) {
            list.add(random.nextInt(20));
        }
    }
}