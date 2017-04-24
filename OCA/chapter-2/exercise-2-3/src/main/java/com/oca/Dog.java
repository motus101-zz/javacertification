package com.oca;

public class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }

    public String makeNoise(String string) {
        return "This method was overloaded - " + string;
    }
    public void playWithDaddy() {
        System.out.println("Bark Bark Darrddy !!");
    }
}