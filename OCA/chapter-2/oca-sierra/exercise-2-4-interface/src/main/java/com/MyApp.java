package com;

import com.pets.Dog;
import com.animal.*;

public class MyApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dog1 = new Dog();
       ( (Dog) dog1).dogStuff();
        dog.getMyAdress();
        dog.setLegs(4);
        System.out.println("I have " + dog.getLegs() + " legs");
    }
}