package com;

public class MyApplication implements Buzz {
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.doBuzzStuff();
    }

   public boolean doFooStuff() {
        return true;
    }

   public int doBarStuff(String[] args) {
        return args.length;
    }

   public void doBuzzStuff() {
        System.out.printf("The output is - %d, %s \n", doBarStuff(new String[] {"A","b","c"}), doFooStuff());
    }
}