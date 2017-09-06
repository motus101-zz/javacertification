package com;

import com.fortest.*;

public class MyApp extends TestStatic {

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.checkStaticMethod();
    }
    public static void checkStaticMethod() {
        System.out.println("From MyApp second");
    }
//    public static void checkStaticMethod() {
//        System.out.println("From MyApp second");
//    }
}

public class TestClass{    static int si = 10;    public static void main (String args[]){       new TestClass();    }    public TestClass(){       System.out.println(this);    }    public String toString(){       return "TestClass.si = "+this.si;    } }