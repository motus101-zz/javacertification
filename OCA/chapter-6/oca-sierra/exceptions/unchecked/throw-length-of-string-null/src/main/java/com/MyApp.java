package com;

import java.lang.StringBuilder;
import java.lang.StringIndexOutOfBoundsException;
import java.util.Scanner;
import com.exceptions.*;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Type word pls!");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            reverse(s);
        } catch (MyFirstException myFirstException) {
            System.out.println(myFirstException.getMessage() + "Try one more time!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Programm compliteed");
        }
    }

    static void reverse(String string) {
        String reverseString = "";
        if (string.length() <= 1) throw new MyFirstException();
        System.out.println(string.length());
        for (int i = string.length(); i > 0; i--) {
            reverseString += string.charAt(i);
        }
        System.out.println(reverseString);
    }
}