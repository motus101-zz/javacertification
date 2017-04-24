package com;

import com.duck.*;
import com.behaviors.fly.*;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hi");
        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.peformFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.peformFly();
    }
}