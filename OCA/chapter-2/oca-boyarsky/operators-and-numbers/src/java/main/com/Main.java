package com;

import java.lang.*;

class Main {
    private short s = Short.MAX_VALUE;
    private int i = Integer.MAX_VALUE;
    private long l = Long.MAX_VALUE;
    private double d = Double.MAX_VALUE;

    public static void main(String[] args) {
        byte b1 = 12;
        int i1= 42_000;
        short s1 = 42;
        long l1 = 9_223_372;
        double d1 = 1_700.50;
        float f1 = 34;
        i1 *= l1;
        Main m = new Main();
        m.setI(i1);
        System.out.println(m.toString());
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void setD(double d) {
        this.d = d;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("Main{%n s= %,3d%n i= %,3d%n l= %,3d%n d= %,3.3f%n}", s, i, l, d);
    }
    
}