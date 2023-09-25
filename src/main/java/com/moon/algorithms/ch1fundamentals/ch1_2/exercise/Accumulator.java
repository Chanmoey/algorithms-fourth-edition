package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

/**
 * @author Chanmoey
 * @date 2023/9/18
 */
public class Accumulator {

    private double m;
    private double s;
    private int n;

    public void addDataValue(double x) {
        this.n ++;
        this.s = s + 1.0 * (n - 1) / n * (x - m) * (x -m);
        this.m = m + (x -m) / n;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (n - 1);
    }

    public double stdDev() {
        return Math.sqrt(this.var());
    }
}
