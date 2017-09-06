package com;

interface Buzz extends Bar, Foo {
    int i = 42;
    void doBuzzStuff();

    default String  returnValue(){
        return "Test";
    }

}