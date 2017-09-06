package com.fortest;

import java.util.Random;

public class Dog extends Animal {
    private String name;

    public Dog() {
        this(getRandomName());
    }

    public Dog(String name) {
        super();
        this.name = name;
    }

    static String getRandomName() {
        int i = new Random().nextInt(4);
        return new String[]{"Pot", "Chapy", "Buch", "Bullet"}[i];
    }

    public String getName() {
        return name;
    }
}