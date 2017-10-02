package com;

import com.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer aInteger = 42;
        Integer aInteger1 = 42;
        Float aFloat = 42.0f;
        Long aLong = 42L;
        System.out.println(aInteger.getClass() + " " + aInteger.toString());
        System.out.println(aLong.getClass() + " " + aLong.toString());
        System.out.println(aInteger1 == aInteger);
        System.out.println(aInteger.equals(aInteger1));

    }

    public static void m1() throws Exception {
        throw new Exception();
    }

}