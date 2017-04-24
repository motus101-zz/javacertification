package com;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        doArrList();

    }

    public static void doArr() {
        int[][] a = {{1,2},{3,5}};
        int[] b = a[1];
        Object a1 = a;
        int[][] b2 = (int[][]) a1;
        System.out.printf("The number is %d \n", b2[1].length);
    }

    public static void doArrList() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        System.out.printf("The size of arr is - %d\n", integerList.size());
        System.out.println("Classic for");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println("Enhanced for");
        for (Integer i : integerList) {
            System.out.println(i);
        }
        System.out.println("Foreach using lambda");
        integerList.forEach(value -> System.out.println(value));
        System.out.println("Using method reference ");
        integerList.forEach(System.out::println);
    }
}