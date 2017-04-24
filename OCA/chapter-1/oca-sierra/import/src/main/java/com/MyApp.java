package com;

import com.foo.*;
import com.foo.bar.Water;

public class MyApp {
    public static void main(String[] args) {
        com.foo.Water water = new com.foo.Water();
        water.doThing();
    }
}