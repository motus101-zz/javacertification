package com;

import java.io.IOException;

abstract class Parent {
    void myStaticMethod() throws IOException {
        System.out.println("I belong to Parent");
    }
    abstract void absMethod();
    void doGeneralThings() {
        System.out.println("From Parent");
    }
}