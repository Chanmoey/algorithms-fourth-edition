package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class ThreeSumFast {

    public static int count(int[] a) {
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (BinarySearch.rank(-(a[i] + a[j]), a) > j) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
