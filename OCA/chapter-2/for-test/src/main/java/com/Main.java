package com;

public class Main {
    public static void main(String... arags) {
        Main m = new Main();
        m.doSomeWork();
    }
<<<<<<< HEAD

=======
>>>>>>> e420a6de2233d8277aea79cf5034adfd405e9de1
    public void doSomeWork() {
        int a = 10, b = 5;
        do {
            int y = 1;
<<<<<<< HEAD
            System.out.println("The y is - " + ++);
=======
            System.out.println("The y is - " + y);
>>>>>>> e420a6de2233d8277aea79cf5034adfd405e9de1
        }
        while (++b < 10);
    }
}