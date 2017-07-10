package com;

import com.food.*;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.whoAmI();
        System.out.println(apple.doThings(42));
    }
}