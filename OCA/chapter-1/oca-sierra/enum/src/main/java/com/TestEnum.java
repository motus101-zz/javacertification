package com;
import com.sizenum.SizeEnum;
public class TestEnum {
    SizeEnum sizeEnum;
    static public void main(String[] args) {
        TestEnum test = new TestEnum();
        System.out.println("The size of coffe is \t" + test.sizeEnum.LARG.getMl());
    }
}