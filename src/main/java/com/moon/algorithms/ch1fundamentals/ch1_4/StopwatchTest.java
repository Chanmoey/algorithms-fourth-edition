package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.std.StdOut;
import com.moon.algorithms.std.StdRandom;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class StopwatchTest {

    public static void main(String[] args)
    {
        int N = 1000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(-1000000, 1000000);
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(cnt + " triples " + time);
    }
}
