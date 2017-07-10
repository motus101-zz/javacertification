package com;

public class MyApp {
    Short aShort = 200;

    MyApp go(MyApp app) {
        app = null;
        return app;
    }

    public static void main(String[] args) {
        MyApp app1 = new MyApp();
        MyApp app2 = new MyApp();
        MyApp app3 = app1.go(app2);
        app1 = null;
        checkApp(app1, app2, app3);
    }

    public static void checkApp(com.MyApp app1, com.MyApp app2, com.MyApp app3) {

        switch (null) {
            case app1:
                System.out.println("App1 is null \n");
            case app2:
                System.out.println("App2 is null \n");
            case app3:
                System.out.println("App3 is null \n");
                default:
                    System.out.println("Error \n");
                    break;
        }
    }
}