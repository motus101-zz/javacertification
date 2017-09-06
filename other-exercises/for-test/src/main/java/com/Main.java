package com;

import com.util.*;
import java.util.*;
import java.*;
import static com.util.ArrayUtil.*;

public class Main {
    public static void main(String ... args) {
        ClassB cb = new ClassB();
//        cb.print();
        int[][] ints = new int[3][4];
        fillArray(ints);
        printArray(ints);
    }
}