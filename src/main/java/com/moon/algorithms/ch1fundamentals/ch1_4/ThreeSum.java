package com.moon.algorithms.ch1fundamentals.ch1_4;

import java.util.Arrays;

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
                    if (threeSumEq0(a[i], a[j], a[k])) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    private static boolean threeSumEq0(int... abc) {

        if (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
            return false;
        }
        if (abc[0] < 0 && abc[1] < 0 && abc[2] < 0) {
            return false;
        }
        Arrays.sort(abc);

        return (abc[0] + abc[2]) == -abc[1];
    }
}
