package com;

import com.fortest.*;

import static java.lang.System.*;

public class MyApp extends MyAbstClass {
    public static void main(String[] arg) {
        MyApp app1 = new MyApp();
        MyAbstClass app2 = new MyApp();
        MyInterface app3 = new MyApp();

        app1.checkPolim(app1);

    }

    public void doInterfaceStuff() {
        System.out.println("Interface's method!");
    }

    public void doAbstClassStuff() {
        System.out.println("Abstract's method!");
    }

    public void doMyAppStuff() {
        System.out.println("MyApp's method!");
    }

    public void checkOverridden() {
        System.out.println("Overridden!");
    }

    public void checkPolim(MyAbstClass ar) {
        ar.checkOverridden();
    }
}
