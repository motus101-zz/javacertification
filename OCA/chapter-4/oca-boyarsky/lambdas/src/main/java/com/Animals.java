package com;

public class Animals {
    private boolean canSwim;
    private boolean canHop;
    private String typeOfAnimals;

    public Animals(String animals, boolean swim, boolean hop) {
        typeOfAnimals = animals;
        canSwim = swim;
        canHop = hop;
    }

    public String getTypeOfAnimals() {
        return typeOfAnimals;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public boolean isCanHop() {
        return canHop;
    }
}