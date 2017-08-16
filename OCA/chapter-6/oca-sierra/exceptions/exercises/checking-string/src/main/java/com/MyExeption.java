package com;

import java.lang.RuntimeException;

public class MyExeption extends RuntimeException {
    public MyExeption(String string) {
        super(string);
    }
}