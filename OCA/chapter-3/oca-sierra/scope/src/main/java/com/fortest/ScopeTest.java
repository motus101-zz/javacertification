package com.fortest;

public class ScopeTest {
    private static final int INT = 42;

    public int go() {
        int test = 0;
        for (int i = 0; i <= INT; i++) {
            test += i;
            System.out.println(i + "_________" + test);
        }
        return test;
    }
}