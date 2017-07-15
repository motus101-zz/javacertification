package com;

import com.animal.*;

public class MyApp {
    public static void main(String[] arg) {
        Animal horse = new Horse();
        horse.makeSound("bark");
        horse.prefFood();
    }
}