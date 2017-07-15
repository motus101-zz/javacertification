package com.pets;

import com.animal.*;

public class Dog extends Animal implements Pet {
    private String name;
    private String master;
    private String adress = "Happy strit";

    public void dogStuff() {
        System.out.println("Bark");
    }

    public void move() {
        System.out.println("I prefer run!");
    }

    public void getMyAdress() {
        System.out.println("My adress is " + this.adress);
    }


}