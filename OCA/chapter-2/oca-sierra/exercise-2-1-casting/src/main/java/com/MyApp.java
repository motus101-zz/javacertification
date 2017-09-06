package com;

import com.foo.*;

public class MyApp {
    public static void main(String[] args) {
        SubClass sb = new SubClass();
        SuperClass sc = new SuperClass();
        sc = (SuperClass) sb;
    }
}