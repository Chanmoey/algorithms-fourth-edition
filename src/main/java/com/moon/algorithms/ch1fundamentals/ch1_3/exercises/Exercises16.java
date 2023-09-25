package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.std.Date;
import com.moon.algorithms.std.In;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises16 {
    public static void main(String[] args) {
        DateIn dateIn = new DateIn("date.txt");
        Date[] dates = dateIn.readAllDate();
        System.out.println(Arrays.toString(dates));
    }

    private static class DateIn{
        private final In in;
        public DateIn(String filePath) {
            in = new In(filePath);
        }

        public DateIn() {
            in = new In();
        }

        public Date[] readAllDate() {
            String[] dateStr = in.readAllStrings();
            Date[] dates = new Date[dateStr.length];
            for (int i = 0; i < dates.length; i++) {
                dates[i] = new Date(dateStr[i]);
            }

            return dates;
        }
    }
}
