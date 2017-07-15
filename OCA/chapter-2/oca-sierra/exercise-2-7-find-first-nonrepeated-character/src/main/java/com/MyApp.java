package com;

import java.util.Scanner;
import java.util.HashMap;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Pls print word");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        MyApp app = new MyApp();

        app.findFirstNonRepeatedChar(word);
        System.out.println("The char is - " + app.findFirstNonRepeatedChar(word));
    }

    Character findFirstNonRepeatedChar(String string) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        Character ch;

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (hash.get(ch) == 1) return ch;
        }
        return null;
    }
}