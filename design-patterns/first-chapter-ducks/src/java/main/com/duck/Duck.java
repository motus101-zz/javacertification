package com.duck;

import com.behaviors.fly.*;
import com.behaviors.quack.*;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public String type;

    public void swim() {
        System.out.println("It's swiming!");
    }

    public void display() {
        System.out.println("I am a - " + type);
    }

    public void peformFly(){
        flyBehavior.fly();
    }

    public void peformQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}