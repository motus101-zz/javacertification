package com.foo;

public enum EnumSize {
    SMALL(1), MEDIUM(2), BIG(3);
    private int size;

    EnumSize(int s) {
        this.size = s;
    }

    public int getSize() {
        return size;
    }
}