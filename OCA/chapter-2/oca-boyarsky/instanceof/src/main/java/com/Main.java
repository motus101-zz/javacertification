package com;

import com.util.*;

public class Main {
    public static void main(String... args) {
        Foo f = new Foo();
        Bar b = new Bar();
        ParentFoo pf = new Foo();

        if (f instanceof Foo) {
            System.out.println("All is good!");
        } else {
            System.out.println("Mmmm ...");
        }
    }
}