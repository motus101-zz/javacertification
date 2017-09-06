package com;

import com.animal.*;
import com.util.*;

public class MyApp {
    public static void main(String[] arg) {
        Horse horse = new Horse();
            horse.setAnInt(100);
            System.out.println(horse.getAnInt());
            horse.makeSound("bark");
            horse.prefFood();
    }
}