package com;

import com.oca.*;

public class CastTest {
    public static void main(String[] arg) {

        CastTest castTest = new CastTest();

        Animal animal = new Animal();

        Dog dog = new Dog();

        Animal d = new Dog();

        castTest.doTest(animal);


        Animal[] animals = {new Animal(), new Dog(), new Animal()};

        for (Animal an : animals) {
            if (an instanceof Dog) {
                ((Dog) an).playWithDaddy();
            }
        }
    }

    public void doTest(Animal aniaml) {
        System.out.println("I am from Animal");
        aniaml.makeNoise();
    }

    public void doTest(Dog dog) {
        System.out.println("I am from Dog");
        dog.makeNoise();
    }
}