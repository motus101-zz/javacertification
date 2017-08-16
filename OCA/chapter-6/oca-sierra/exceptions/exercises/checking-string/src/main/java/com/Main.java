package com;

public class Main {
    public static void main(String... args) {
        String str = "Hi there!";
        try {
            str = reverse(str);
        } catch (MyExeption myExeption) {
            System.err.println("got error");
            System.err.println(myExeption.getMessage());
            myExeption.printStackTrace();
        } catch (StringIndexOutOfBoundsException exception) {
            System.err.println("got error");
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        } finally {
            System.out.println("Done!");
            System.out.println(str);
        }
    }

    static String reverse(String string) throws MyExeption {
        if (string.isEmpty()) throw new MyExeption("String is empty!");
        System.out.println(string.charAt(23));
        String revString = "";
        for (int i = string.length() - 1; i >= 0; --i) {
            revString += string.charAt(i);
        }
        return revString;
    }
}