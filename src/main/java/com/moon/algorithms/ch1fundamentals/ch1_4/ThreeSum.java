package com.moon.algorithms.ch1fundamentals.ch1_4;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class ThreeSum {

    public static int count(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if ((a[i] + a[j] + a[k]) == 0) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}
