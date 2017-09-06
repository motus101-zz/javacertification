package com.util;

import com.*;

public class CheckIfSwim implements CheckAnimals {
    public boolean check(Animals a) {
        return a.isCanSwim();
    }
}