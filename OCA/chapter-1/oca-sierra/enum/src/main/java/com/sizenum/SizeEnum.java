package com.sizenum;

public enum SizeEnum {
    SMALL(10), MID(50), LARG(100);
    private int ml;
    SizeEnum(int ml) {
        this.ml = ml;
    }
    public int getMl() {
        return ml;
    }
}