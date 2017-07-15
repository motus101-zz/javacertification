package com;

class Bird {
    { System.out.println("b1 "); }
    public Bird() { System.out.println("Constructor b2 "); }
    static {
        System.out.println("b3 ");
    }
}
class Raptor extends Bird {
    static { System.out.println("r1 "); }
    public Raptor() { System.out.println("Constructor r2 "); }
    { System.out.println("r3 "); }
    static { System.out.println("r4 "); }
}
public class MyApp extends Raptor {
    public int p = 1;
    static {
        System.out.println("Static init from MyApp");
    }
    {
        System.out.println("Instance init from MyApp   " + p);
    }

    public MyApp() {
        this.p = 6;
        System.out.println("Constructor from MyApp  " + p);
    }

    public int getP() {
        return p;
    }

    public static void main(String[] args) {
        System.out.print("pre ");
        MyApp app = new MyApp();
        System.out.println("hawk " + app.getP());
    }
}
//    r1 r4 pre b1 b2 r3 r2 hawk
