package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_2.exercise.Transaction;
import com.moon.algorithms.std.Date;
import com.moon.algorithms.std.In;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises17 {
    public static void main(String[] args) {
        TransactionIn dateIn = new TransactionIn("transaction.txt");
        Transaction[] dates = dateIn.readAllTransaction();
        System.out.println(Arrays.toString(dates));
    }

    private static class TransactionIn{
        private final In in;
        public TransactionIn(String filePath) {
            in = new In(filePath);
        }


        public Transaction[] readAllTransaction() {
            String[] dateStr = in.readAllLines();
            Transaction[] dates = new Transaction[dateStr.length];
            for (int i = 0; i < dates.length; i++) {
                dates[i] = new Transaction(dateStr[i]);
            }

            return dates;
        }
    }
}
