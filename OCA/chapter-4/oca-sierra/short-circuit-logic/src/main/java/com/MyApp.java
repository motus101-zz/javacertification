package com;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        int z = 5;
        if (z > 3) z = z++ + 5 + z * 2;

        if (!(4 < 3)) System.out.println("Ping!");

        System.out.printf("The Z is %d \n", z);
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5));
        int[] arr1 = {1, 2, 3, 4,};
    }
}