package com;

import com.foo.bar.Water;
import com.foo.*;
import static com.foo.bar.Water.*;

public class MyApp {
    public static void main(String[] args) {
        Water water = new Water();
        water.doThing(NUMBER);
    }
}