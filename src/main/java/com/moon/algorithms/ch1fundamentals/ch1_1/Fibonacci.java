package com.moon.algorithms.ch1fundamentals.ch1_1;

/**
 * @author Chanmoey
 * @date 2023/9/8
 */
public class Fibonacci {

    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }

    public static long FBetter(int N) {

        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int[] array = new int[N + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= N; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        return array[N];
    }
}
