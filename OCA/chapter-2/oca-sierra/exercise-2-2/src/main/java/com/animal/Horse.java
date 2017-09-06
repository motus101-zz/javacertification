package com.animal;

import static java.lang.System.*;
import com.util.*;

public class Horse extends Animal {
    private int anInt = 24;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        try {
            if (anInt >= 100) throw new MyExceptions("Should be less than 100");
            this.anInt = anInt;
        } catch (MyExceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
    }

    public void prefFood() {
        out.println("I like oats!");
    }

    @Override
    public void makeSound(String... sound) {
        out.printf("I can make a sound - %s \n", sound[0]);
    }
}