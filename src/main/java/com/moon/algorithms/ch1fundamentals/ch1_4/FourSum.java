package com.moon.algorithms.ch1fundamentals.ch1_4;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class FourSum {

    /**
     * not same num at a
     */
    public static int count(int[] a) {
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int target = - a[i] - a[j];
                int l = j + 1;
                int r = a.length - 1;
                while (l < r) {
                    if (a[l] + a[r] == target) {
                        cnt++;
                        l++;
                        r--;
                    } else if (a[l] + a[r] > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }

        return cnt;
    }
}
