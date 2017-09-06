package com.util;

import com.util.exceptions.*;

public class ClassA {
    public int a = 42;

    public ClassA() {
        throw new MyExceptionClass();
    }

    public final void print() {
        System.out.println("Hi from super class!");
    }
}