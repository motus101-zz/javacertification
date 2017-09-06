package com;

interface Bar {
    int doBarStuff(String[] args);

    static String returnBarValue() {
        return "42";
    }
}