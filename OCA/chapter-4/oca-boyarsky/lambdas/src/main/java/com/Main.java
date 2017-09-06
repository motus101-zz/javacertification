package com;

import com.util.*;

import java.util.*;

public class Main {
    public static void main(String... args) {
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals("fish", true, false));
        animalsList.add(new Animals("cow", false, true));
        animalsList.add(new Animals("rabbit", false, true));
        animalsList.add(new Animals("shark", true, false));
        print(animalsList, new CheckIfSwim());
    }

    static void print(List<Animals> animals, CheckIfSwim checkIfSwim) {
        for (Animals a : animals) {
            if (checkIfSwim.check(a)) {
                System.out.println(a.getTypeOfAnimals() + " can swim.");
            }
        }
    }
}