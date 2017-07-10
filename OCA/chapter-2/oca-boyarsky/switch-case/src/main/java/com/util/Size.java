package com.util;

public enum Size {
        BIG(15), MID(10), SMALL(5);
        int size;

        Size(int i) {
        size = i;
    }

    public int getSize() {
        return size;
    }
}