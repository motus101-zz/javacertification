package com;

import com.foo.*;

public class TestEquals {
    public static void main(String... args) {
        MyClass myClass = new MyClass(42, "text", 'c');
        System.out.println(myClass.toString());
    }
}