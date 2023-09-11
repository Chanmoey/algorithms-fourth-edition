package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdRandom;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double l = in.nextDouble();
        double r = in.nextDouble();
        double diff = (r - l) / n;
        double[] barLine = new double[n];
        int count = in.nextInt();
        StdRandom.setSeed(1);
        for (int i = 0; i < count; i++) {
            double next = StdRandom.uniformDouble() * (r - l) + l;
            for (int j = 1; j <= n; j++) {
                if (l + j * diff > next) {
                    barLine[j - 1]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(barLine));
        System.out.println(Arrays.stream(barLine).sum());
        StdDraw.setXscale(-1, 2);
        StdDraw.setYscale(-1, count);
        double x = l;
        for (int i = 0; i < n; i++) {
            StdDraw.rectangle(x + diff / 2,
                    barLine[i] / 2.0,
                    diff / 2,
                    barLine[i] / 2.0);
            x += diff;
        }
    }
}

