package com;

import com.fortest.*;

public class MyApp {
    public static void main(String[] arg) {
        MyApp mp = new MyApp();

        Animal a = new Animal();

        Horse h = new Horse();

        Animal ah = new Horse();

        mp.checkClass(h);
    }

    public void checkClass(Animal animal) {
        System.out.println("Animal__________");
        animal.doSomeThings();
    }

    public void checkClass(Horse horse) {
        System.out.println("Horse__________");
        horse.doSomeThings();
        horse.checkFor();
    }

}