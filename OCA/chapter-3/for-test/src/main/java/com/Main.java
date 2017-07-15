package com;

<<<<<<< HEAD
public class Main {
    public static void main(String... args) {

=======
import com.foo.*;

public class Main {
    public static void main(String... args) {
        Immutable im = new Immutable();
        im.i = 24;
        System.out.println(im.i);
        System.out.println(im.getI());
>>>>>>> e420a6de2233d8277aea79cf5034adfd405e9de1
    }
}