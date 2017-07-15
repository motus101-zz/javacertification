package com;

import com.foo.*;

public class InitialazerBlock extends SuperClass {
    static {
        System.out.println("From static block!____");
    }

    private int number;
    private String string;

    {
        System.out.println("Hi from block!");
        number = 42;
        System.out.println(number);
        string = "Forty two!";
        System.out.println(toString());
    }

    public InitialazerBlock() {
        System.out.println(this);
        System.out.println("Hi from constructor!");
    }

    public static void main(String[] args) {
        InitialazerBlock block = new InitialazerBlock();
        System.out.println(block);
    }

    @Override
    public java.lang.String toString() {
        return "InitialazerBlock{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}