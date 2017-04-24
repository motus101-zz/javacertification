package com.duck;

import com.behaviors.fly.*;
import com.behaviors.quack.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        type = "MallardDuck";
    }
}