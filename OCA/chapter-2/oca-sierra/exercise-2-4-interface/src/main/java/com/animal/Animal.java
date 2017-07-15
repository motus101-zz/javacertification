package com.animal;

public abstract class Animal {
    private int legs;
    public abstract void move();

    public void makeSound() {
        System.out.println("Make some noise!");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}