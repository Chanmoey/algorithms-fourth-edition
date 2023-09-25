package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.Date;

import java.time.LocalDate;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class SmartDate extends Date {

    private final static String[] DAY_OF_WEEK = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public SmartDate(int month, int day, int year) {
        super(month, day, year);
    }

    public SmartDate(String date) {
        super(date);
    }

    public String dayOfTheWeek() {
        int y0 = year() - (14 - month()) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month() + 12 * ((14 - month()) / 12) - 2;
        int d0 = (day() + x + (31*m0)/12) % 7;
        return DAY_OF_WEEK[d0];
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Invalid Year");
        }

        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
