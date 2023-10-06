package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class TwoSumFast {

    public static int count(int[] a) {
        int n = a.length;
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }
}
