package com;

import com.util.*;

public class MyApp {
    public static void main(String[] args) {
        PlayWithTime withTime = new PlayWithTime();
        PlayWithDate playWithDate = new PlayWithDate();
        PlayWithDateParse dateParse = new PlayWithDateParse();

        playWithDate.printCombainDateTime();
        playWithDate.showNumberOfDaysSince1970();
    }
}