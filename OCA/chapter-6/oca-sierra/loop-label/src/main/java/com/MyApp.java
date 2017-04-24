package com;

public class MyApp {
    static int[] arr = new int[20];
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ++i;
        }
//        firstMethod();
//        secondMethod(10);
        theerdMethod(arr);
    }

    public static void firstMethod() {
        for (int i = 0; i < arr.length; ) {
            arr[i] = ++i;
        }
        POINT1:
        for (int i : arr) {
            if (i == 10) break POINT1;
            System.out.println(i);
        }
        System.out.println("Passing first point");
        POINT2:
        while (count <= arr.length) {
            count++;
            if (count == 8) {
                continue POINT2;
            } else if (count == 15) {
                break POINT2;
            }
            System.out.println("___second " + count);
        }
        System.out.println("Passing second point");
    }

    public static void secondMethod(int i) {
        int j = (i * 30 - 2) / 100;
        System.out.println(j + "_-");
        POINT1:
        for (; j < 10; j++) {
            boolean flag = false;
            while (!flag) {
                if (Math.random() > 0.5) break POINT1;
            }
        }
        System.out.println(j + "_-");
        POINT2:
        while (j > 0) {
            System.out.println(j--);
            if (j == 4) break POINT2;
        }
        System.out.println(j + "_-");
    }

    public static void theerdMethod(int[] arr) {
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) continue;
            if (value > 4) arr[counter] = value + 1;
            counter++;
        }
        System.out.println(counter);
        System.out.println(arr[counter]);
    }
}


