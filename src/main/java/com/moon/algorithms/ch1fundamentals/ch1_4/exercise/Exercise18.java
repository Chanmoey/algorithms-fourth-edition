package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise18 {

    public static void main(String[] args) {
        int[] array1 = {10, -9, 20, 25, 21, 40, 50, -20};
        int[] array2 = {-4, -3, 9, 4, 10, 2, 20};
        int[] array3 = {5, -3, -5, -6, -7, -8};
        int[] array4 = {5};
        int[] array5 = {10, 20};
        int[] array6 = {7, 20, 30};

        int localMinimum1 = localMinimum(array1);
        int localMinimum2 = localMinimum(array2);
        int localMinimum3 = localMinimum(array3);
        int localMinimum4 = localMinimum(array4);
        int localMinimum5 = localMinimum(array5);
        int localMinimum6 = localMinimum(array6);

        StdOut.println("Local Minimum: " + array1[localMinimum1] + " Expected: -9 or -20");
        StdOut.println("Local Minimum: " + array2[localMinimum2] + " Expected: 4 or -4 or 2");
        StdOut.println("Local Minimum: " + array3[localMinimum3] + " Expected: -8");
        StdOut.println("Local Minimum: " + array4[localMinimum4] + " Expected: 5");
        StdOut.println("Local Minimum: " + array5[localMinimum5] + " Expected: 10");
        StdOut.println("Local Minimum: " + array6[localMinimum6] + " Expected: 7");
    }

    public static int localMinimum(int[] a) {
        if (a.length == 1) {
            return 0;
        }

        if (a.length == 2) {
            if (a[0] == a[1]) {
                return -1;
            } else if (a[0] < a[1]) {
                return 0;
            } else {
                return 1;
            }
        }

        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m == 0) {
                if (a[m] < a[m + 1]) {
                    return m;
                } else {
                    return -1;
                }
            }

            if (m == a.length - 1) {
                if (a[m - 1] > a[m]) {
                    return m;
                } else {
                    return -1;
                }
            }

            if (a[m - 1] > a[m] && a[m+1] > a[m]) {
                return m;
            } else if (a[m - 1] < a[m]) {
                r = m - 1;
            } else if (a[m + 1] < a[m]) {
                l = m + 1;
            } else {
                throw new IllegalArgumentException("Not distinct integer");
            }

        }

        return -1;
    }
}
