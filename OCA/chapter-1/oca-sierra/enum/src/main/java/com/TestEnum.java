package com;
import com.sizenum.*;
public class TestEnum {
    SizeEnum sizeEnum;
    static public void main(String[] args) {
        TestEnum test = new TestEnum();
        int size = test.sizeEnum.SMALL.getMl();
        for (SizeEnum s : test.sizeEnum.values()) {
            System.out.println(s.getMl());
        }
        System.out.println("The size of coffe is \t" + size);

        SizePlanetEnum anEnum = new SizePlanetEnum();
        anEnum.printSomething();

    }
}