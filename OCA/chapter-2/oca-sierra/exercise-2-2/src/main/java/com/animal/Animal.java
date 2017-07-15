package com.animal;

import static java.lang.System.*;

public abstract class Animal {

    public abstract void prefFood();

    public void makeSound(String... sound ) {
        out.printf("My sound is - %s \n", sound[0]);
    }
}
