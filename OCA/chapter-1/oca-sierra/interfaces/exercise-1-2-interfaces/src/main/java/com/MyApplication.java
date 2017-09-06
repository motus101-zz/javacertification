package com;

public class MyApplication implements Buzz {
   public int i = 24;
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.doBuzzStuff();
        System.out.println(((Buzz) app).i);
        System.out.println(app.returnValue());
        System.out.println(Buzz.returnBarValue());
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