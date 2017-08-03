package com;

import java.util.*;

public class MyApp {

    public static void main(String[] args) {
        if (args.length == 1  && args[0].equals("test")) {
            System.out.println(Arrays.toString(args));
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}