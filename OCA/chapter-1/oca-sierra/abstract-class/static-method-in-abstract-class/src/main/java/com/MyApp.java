package com;

import com.foo.*;

public class MyApp {
    public static void main(String[] args) {
        MyAbstractClass aClass = new MySubClass();
        aClass.doGeneralThings();
        aClass.doConcreteThings();
        aClass.staticMethod();
    }
}