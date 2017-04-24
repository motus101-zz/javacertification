package com;

class MyApp {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 5) {
            i++;
        }
        String m = i > 5 ? "Greater than 5 \t" : "Less than 5 \t";
        System.out.println(m + i);
    }
}