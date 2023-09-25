package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.In;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class Exercise18 {
    public static void main(String[] args) {
        In in = new In("tinyW.txt");
        int[] ints = in.readAllInts();
        double myMean = (double) Arrays.stream(ints).sum() / ints.length;
        double myVar = getVar(ints, myMean);
        double myStdVar = Math.sqrt(myVar);

        System.out.println("mean: " + myMean + " var:" + myVar + " stdVar:" + myStdVar);

        Accumulator accumulator = new Accumulator();
        for (int n : ints) {
            accumulator.addDataValue(n);
        }
        System.out.println("mean: " + accumulator.mean() + " var:" + accumulator.var() + " stdVar:" + accumulator.stdDev());
    }

    public static double getVar(int[] arr, double mean) {
        double res = 0.0;
        for (int n : arr) {
            res += Math.pow(n - mean, 2);
        }
        return res / arr.length;
    }
}
