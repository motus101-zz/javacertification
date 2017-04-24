package com;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class MyApp {
    private HashMap<Character, Integer> hashMap  = new HashMap<>();
    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println("Pls type a word or a phrase!");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim().toLowerCase();
        app.fillHash(string);
        app.findFirstNonRepeatingChar(string);
    }
    void fillHash(String s) {
        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.replace(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap.toString());
    }

    void findFirstNonRepeatingChar(String string) {
        System.out.println(string.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> hashMap.get(i) == 1)
                .findFirst());
    }

}