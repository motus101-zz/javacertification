package com.fortest;

import java.util.Random;

public class Dog extends Animal {
    private String name;

    public Dog() {
        int i = new Random().nextInt(4);
        this.name = new String[]{"Pot", "Chapy", "Buch", "Bullet"}[i];
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}