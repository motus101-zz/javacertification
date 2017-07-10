package com;

public class MyApp {
    int i = 5;
    public static void main(String[] args) {
        final MyApp app = new MyApp();
        MyApp app1 = new MyApp();
        MyApp app2 = switchMyApp(app, app1);
        System.out.println(app.i+", "+app1.i+", "+app2.i);
    }

    static MyApp switchMyApp(MyApp x, MyApp y) {
        x.i++;
        MyApp app = y;
        y.i = 42;
        return app;
    }
}