package com;

public class MyApp {
    int i = 0;
    MyApp p;
    MyApp() {
        super();
    }
    MyApp(MyApp i, int x) {
        this();
        this.i = x;
        p = this;
        if (i != null) p = i;
    }
    public static void main(String[] args) {
        MyApp app1 = new MyApp(null, 3);
        app1.p.i++;
        MyApp app2 = new MyApp();
        MyApp app3 = new MyApp(app2, 42);
        MyApp app4 = app3.p;
        System.out.printf("Print app1.i + 1 %d \n", (app1.i + 1) );
        System.out.printf("Print app1.p.i + 1 = %d and app1 == app1.p is %b \n", (app1.p.i + 1), (app1 == app1.p) );
        System.out.printf("Print app2.i + 2 = %d and app2.p is %s \n", (app2.i + 2), app2.p );
        System.out.printf("Print app3.i + 3 = %d and app3.p == app2 is %b \n", (app3.i + 3), (app2 == app3.p) );
        System.out.printf("Print app3.p.i %d \n", app3.p.i);
        System.out.printf("Print app4 == app2 is %b \n", (app2 == app4) );
    }

    void go() {
        System.out.println("Hi!!!");
    }
}