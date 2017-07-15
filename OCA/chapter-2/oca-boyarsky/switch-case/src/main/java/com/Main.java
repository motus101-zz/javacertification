package com;

import com.util.*;

public class Main {
    Size size;

    public Main(Size i) {
        this.size = i;
    }
    public static void main(String... args) {
        Main m = new Main(Size.SMALL);
        switch (m.size) {
            case BIG:
                System.out.println("big");
                System.out.println(m.size.getSize());
                break;
            case SMALL:
                System.out.println("small");
                System.out.println(m.size.getSize());
                break;
            case MID:
                System.out.println("mid");
                System.out.println(m.size.getSize());
                break;
            default:
                System.out.println("Default");
        }
    }
}