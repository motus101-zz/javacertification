package com;

import java.util.HashMap;
import java.util.Scanner;

public class MyApp {
    private HashMap<Character, Integer> hashMapChar = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Pls type the word or phrase!");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim().toLowerCase();
        MyApp app = new MyApp();
        app.fillHashMap(string);
        app.findFirstNonRepeatChar(string);
    }

    public void fillHashMap(String st) {
        char[] chars = st.toCharArray();
        for (char c : chars) {
            if (hashMapChar.containsKey(c)) {
                hashMapChar.put(c, hashMapChar.get(c) + 1);
            } else {
                hashMapChar.put(c, 1);
            }
        }
    }

    public void findFirstNonRepeatChar(String st) {
        System.out.println(st.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> hashMapChar.get(i) == 1)
                .findFirst()
        );
    }
}