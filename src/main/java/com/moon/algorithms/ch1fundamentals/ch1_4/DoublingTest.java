package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.std.StdOut;
import com.moon.algorithms.std.StdRandom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class DoublingTest {

    public static double timeTrial(int n) {
        int max = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniformInt(-max, max);
        }
        Stopwatch timer = new Stopwatch();
        ThreeSum.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Double> y = new ArrayList<>();
        for (int n = 250; n < 4000; n += n) {
            double time = timeTrial(n);
            x.add(n);
            y.add(time);
            StdOut.printf("%7d %5.1f\n", n, time);
        }
        int[] xArr = new int[x.size()];
        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = x.get(i);
        }
        double[] yArr = new double[y.size()];
        for (int i = 0; i < yArr.length; i++) {
            yArr[i] = y.get(i);
        }
    }

}
