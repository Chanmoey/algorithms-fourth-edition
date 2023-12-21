package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_4.Stopwatch;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Chanmoey
 * @date 2023/12/13
 */
public class Exercise38 {

    public static void main(String[] args) {
        int n = 125;
        int[] randomArray = createRandomArray(n);
        double prev = time3Sum(randomArray);
        for (; n < 10000000; n += n) {
            randomArray = createRandomArray(n);
            double time = time3Sum(randomArray);
            System.out.println("rate: " + time / prev);
            prev = time;
        }
        // rate: 0.2
        // rate: 3.0
        // rate: 22.0
        // rate: 7.924242424242424
        // rate: 7.252390057361377
        // rate: 7.96440812022146
        // rate: 8.056903571783243
        // rate: 8.103565867267072
    }

    private static double time3Sum(int[] a) {
        Stopwatch stopwatch = new Stopwatch();
        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    if (i < j && j < k)
                        if (a[i] + a[j] + a[k] == 0)
                            cnt++;
        return stopwatch.elapsedTime();
    }

    private static int[] createRandomArray(int n) {
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(2 * (n + 1)) - n;
        }

        return a;
    }
}
