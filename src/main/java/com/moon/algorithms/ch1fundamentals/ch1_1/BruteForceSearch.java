package com.moon.algorithms.ch1fundamentals.ch1_1;

/**
 * @author Chanmoey
 * @date 2023/9/13
 */
public class BruteForceSearch {
    public static int rank(int key, int[] a)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }
}
