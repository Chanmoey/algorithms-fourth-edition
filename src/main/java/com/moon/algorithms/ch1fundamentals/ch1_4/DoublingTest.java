package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.std.StdOut;
import com.moon.algorithms.std.StdRandom;

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
        for (int n = 250; n < 1000000; n += n) {
            double time = timeTrial(n);
            StdOut.printf("%7d %5.1f\n", n, time);
        }
    }
}
