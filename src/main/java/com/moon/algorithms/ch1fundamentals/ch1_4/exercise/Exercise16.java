package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_4.FourSum;
import com.moon.algorithms.std.StdOut;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise16 {

    public static void main(String[] args) {
        double[] array1 = {-5.2, 9.4, 20, -10, 21.1, 40, 50, -20};
        double[] array2 = {-4, -3, 0, 10, 20};
        double[] array3 = {-10, -3, 0, 2, 4, 20};

        double[] closestPair1 = closestPair(array1);
        double[] closestPair2 = closestPair(array2);
        double[] closestPair3 = closestPair(array3);

        StdOut.println("Closest pair: " + closestPair1[0] + " " + closestPair1[1] + " Expected: 20.0 21.1");
        StdOut.println("Closest pair: " + closestPair2[0] + " " + closestPair2[1] + " Expected: -4.0 -3.0");
        StdOut.println("Closest pair: " + closestPair3[0] + " " + closestPair3[1] + " Expected: 0.0 2.0");
    }

    public static double[] closestPair(double[] a) {
        Arrays.sort(a);
        double diff = Double.MAX_VALUE;
        double[] res = new double[2];
        for (int i = 1; i < a.length; i++) {
            double temp = Math.abs(a[i] - a[i - 1]);
            if (temp < diff) {
                diff = temp;
                res[0] = a[i-1];
                res[1] = a[i];
            }
        }

        return res;
    }
}
