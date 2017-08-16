package com;

import com.exception.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        try {
            app.checkFood(args);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    void checkFood(String[] food) throws MyException {
        List<String> junkFood = new ArrayList<>(Arrays.asList("burger", "cocacola", "fanta", "hotdog", "chips"));
        for (String string : food) {
            if (junkFood.contains(string.toLowerCase()))
                throw new MyException("The list has junk food - " + string);
        }
        System.out.println("All is good!");
    }
}