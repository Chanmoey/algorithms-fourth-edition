package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise15_TwoSumFaster {

    public static void main(String[] args) {

        // Two Sum Faster Test
        int[] array = {-10, -10, -5, 0, 5, 10, 10, 15, 20};
        int[] arrayTest1 = {-3, -2, 2, 3, 5, 99};
        int[] arrayTest2 = {-10, -10, -10, 10, 10};
        int[] arrayTest3 = {0, 0, 0, 0, 0};
        int[] arrayTest4 = {-2, -1, 0, 0, 0, 0, 0, 0, 1};

        StdOut.println("Method 1");
        StdOut.println("TwoSumFaster: " + twoSumFaster(array) + " Expected: 5");
        StdOut.println("TwoSumFaster: " + twoSumFaster(arrayTest1) + " Expected: 2");
        StdOut.println("TwoSumFaster: " + twoSumFaster(arrayTest2) + " Expected: 6");
        StdOut.println("TwoSumFaster: " + twoSumFaster(arrayTest3) + " Expected: 10");
        StdOut.println("TwoSumFaster: " + twoSumFaster(arrayTest4) + " Expected: 16");
    }

    public static int twoSumFaster(int[] a) {
        int l = 0;
        int r = a.length - 1;
        if (a[r] < 0 || a[l] > 0) {
            return 0;
        }

        int count = countZeroMatches(a);
        while (l < r) {
            if (a[l] + a[r] > 0) {
                r--;
            } else if (a[l] + a[r] < 0) {
                l++;
            } else {
                // a[l] == a[r] == 0
                if (a[l] == a[r]) {
                    l++;
                    r--;
                    continue;
                }

                int lc = 1;
                int lr = a[l];
                while (l + 1 < r && a[l + 1] == lr) {
                    lc ++;
                    l++;
                }

                int rc = 1;
                int rr = a[r];
                while (r - 1 > l && a[r - 1] == rr) {
                    rc ++;
                    r--;
                }

                count += lc * rc;
                l++;
                r--;
            }
        }

        return count;
    }

    private static int countZeroMatches(int[] a) {
        int count = 0;
        for (int n : a) {
            if (n == 0) {
                count ++;
            }
        }

        return count * (count - 1) / 2;
    }
}
