package com.moon.algorithms.ch1fundamentals.ch1_1;

/**
 * @author Chanmoey
 * @date 2023/9/7
 */
public class Sqrt {

    private static final double ERR = 1e-15;

    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double t = c;
        while (Math.abs(t - c / t) > ERR * t) {
            t = (c / t + t) / 2.0;
        }

        return t;
    }
}
