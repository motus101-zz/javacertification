package com;

import java.util.*;

public class MyApp {
    static List<String> arr = new ArrayList<String>(Arrays.asList("Apple", "Meat", "Juice", "Chicken", "Milk"));

    public static void main(String[] args) {
        System.out.println("Print food!");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        try {
            checkFood(string);
            System.out.println(string);
        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Work is done!");
        }

    }

    public static void checkFood(String s) throws BadFoodException {
        if (!arr.contains(s)) throw new BadFoodException();
        arr.forEach(System.out::println);
    }
}

class BadFoodException extends Exception {
    @Override
    public String getMessage() {
        return "Bad food";
    }
}