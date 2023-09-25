package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.Date;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class Exercise12 {
    // See SmartDate

    public static void main(String[] args) {
        SmartDate smartDate = new SmartDate(9, 15, 2023);
        System.out.println(smartDate.dayOfTheWeek());

        smartDate = new SmartDate(9, 16, 2023);
        System.out.println(smartDate.dayOfTheWeek());

        smartDate = new SmartDate(9, 17, 2023);
        System.out.println(smartDate.dayOfTheWeek());

        smartDate = new SmartDate(9, 18, 2023);
        System.out.println(smartDate.dayOfTheWeek());
    }
}
