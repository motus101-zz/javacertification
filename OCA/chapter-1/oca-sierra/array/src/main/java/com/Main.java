package com;

import java.util.*;

public class Main {
    static int[] a = {1, 5, 6, 10, 43, 12, 45, 11, 77};
    static int[] b = new int[9];
    public static void main(String[] args) {
        System.arraycopy(a, 3, b, 1, 4);
        System.out.println(Arrays.toString(b));
    }
}