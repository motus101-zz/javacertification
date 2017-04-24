package com;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        int z = 5;
        if (++z > 5 | ++z > 6) z++;
        System.out.printf("The Z is %d \n", z);
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,3,4,5));
        int[] arr1 = {1, 2, 3, 4,};
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Int is %d \n");
        }
//        for (Integer i : arr) {
//            System.out.printf("Int is %d \n", i);
//        }

    }
}