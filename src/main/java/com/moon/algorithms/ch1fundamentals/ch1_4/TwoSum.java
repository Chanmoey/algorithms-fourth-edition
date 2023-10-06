package com.moon.algorithms.ch1fundamentals.ch1_4;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class TwoSum {

    public static int count(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 0) {
                    cnt++;
                }

            }
        }

        return cnt;
    }
}
