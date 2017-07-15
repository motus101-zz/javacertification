package com;

import com.foo.*;

public class MyApp {
    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        SubClass sb = (SubClass) sc;
        System.out.println(sb.getClass().getName());
        System.out.printf("The sc instanceof subclass - %b \n", (sc instanceof SuperClass ));
    }
}