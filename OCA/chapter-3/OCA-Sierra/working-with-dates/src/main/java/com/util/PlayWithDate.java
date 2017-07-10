package com.util;

import java.time.*;

public class PlayWithDate {
    public void printDate() {
        System.out.println(LocalDate.now());
    }

    public void printDateTime() {
        System.out.println(LocalDateTime.now());
    }

    public void printCostumeDate() {
        LocalDate ld = LocalDate.of(2017, Month.APRIL, 4);
        System.out.println(ld);
    }

    public void printCombainDateTime() {
        LocalDateTime ldt = LocalDateTime.of(2017, Month.APRIL, 11, 23, 00, 00);
        System.out.println(ldt);
    }

    public void showNumberOfDaysSince1970() {
        LocalDate ld = LocalDate.now();
//        LocalDate ld = LocalDate.of(1981, Month.OCTOBER, 29);
        long epoch = ld.toEpochDay();
        System.out.printf("The number of days since 1970 are - %d\n", epoch);
    }
}