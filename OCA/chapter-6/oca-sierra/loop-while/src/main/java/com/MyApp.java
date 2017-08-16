package com;

class MyApp {
    public static void main(String[] args) {
        int i = 10;
        do {
            i++;
            String m = i > 10 ? "Greater than 10 \t" : "Less than 5 \t";
            System.out.println(m + i);
        }
        while (i < 10);
    }
}