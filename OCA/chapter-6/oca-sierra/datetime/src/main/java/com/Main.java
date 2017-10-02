package com;

import com.util.date.*;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String... args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Period period = Period.ofMonths(1);
        dateTime = dateTime.plus(period);
        System.out.println(dateTime);

    }
}