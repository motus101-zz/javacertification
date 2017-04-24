package com.animal;

import static java.lang.System.*;

public class Horse extends Animal {

    public void prefFood() {
        out.println("I like oats!");
    }

    @Override
    public void makeSound(String... sound) {
        out.printf("I can make a sound - %s \n", sound[0]);
    }
}