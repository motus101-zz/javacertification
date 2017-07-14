package com;

import com.foo.*;

public class Main {
    public static void main(String... args) {
        Immutable im = new Immutable();
        im.i = 24;
        System.out.println(im.i);
        System.out.println(im.getI());
    }
}