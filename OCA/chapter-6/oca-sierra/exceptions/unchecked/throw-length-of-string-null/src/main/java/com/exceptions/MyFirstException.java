package com.exceptions;

import java.lang.RuntimeException;

public class MyFirstException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Should be more than one char!\n";
    }
}