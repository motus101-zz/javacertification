package com.foo;

import java.text.*;

public class SizeOfLiter {
    private byte aByte = Byte.MAX_VALUE;
    private short aShort = Short.MAX_VALUE;
    private int anInt = Integer.MAX_VALUE;
    private long aLong = Long.MAX_VALUE;
    private float aFloat = Float.MAX_VALUE;
    private double aDouble = Double.MAX_VALUE;

    @java.lang.Override
    public java.lang.String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###.#");
        return "SizeOfLiter{\n" +
                "aByte   =  " + formatter.format(aByte) + "\n" +
                "aShort  =  " + formatter.format(aShort) + "\n" +
                "anInt   =  " + formatter.format(anInt) + "\n" +
                "aLong   =  " + formatter.format(aLong) + "\n" +
                "aFloat  =  " + formatter.format(aFloat) + "\n" +
                "aDouble =  " + formatter.format(aDouble) + "\n" +
                '}';
    }
}