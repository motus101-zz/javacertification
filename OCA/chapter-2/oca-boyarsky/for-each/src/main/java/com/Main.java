package com;

enum Days {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int numberOfDay;
    Days(int i) {
        this.numberOfDay = i;
    }
    public int getNumberOfDay() {
        return numberOfDay;
    }
}

public class Main {
    Days day;
    public Main() {
    }
    public Main(Days d){
        this.day = d;
    }

    public String[] names = new String[]{"Cole", "Tod"};
    public static void main(String... args) {
        Main m = new Main(Days.SATURDAY);
        for (String s : m.names) {
            System.out.println(s);
        }
        for (Days d : m.day.values()){
            System.out.println(d);
        }
    }
}