package com;

public class FieldsAndMethods {
    private int num;
    private String string;

    public static void main(String[] args) {
        FieldsAndMethods fieldsAndMethods = new FieldsAndMethods();
        fieldsAndMethods.setNum(42);
        fieldsAndMethods.setString("Hi!");
        System.out.println(fieldsAndMethods);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "num is " + getNum() + "\n" +
                "string is " + getString();
    }
}