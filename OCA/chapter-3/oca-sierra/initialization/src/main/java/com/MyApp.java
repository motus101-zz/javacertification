package com;
import java.lang.Math;
import java.util.*;
public class MyApp {
    private ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.initValue();
    }

    public void showValue() {
        int[] ints = new int[20];
        System.out.println(ints[2]);
    }

    public void initValue() {
        double i;
        double x = Math.random() * 5;
        if (x > 4) {
            System.out.println("The x is - " + x);
        }
        else {
            i = x;
            System.out.println("The i is - " + x);
        }
    }
}