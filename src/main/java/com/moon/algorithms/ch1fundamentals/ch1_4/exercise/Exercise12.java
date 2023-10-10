package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_4.StaticSETofInts;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise12 {

    public static void main(String[] args) {
        int[] array1 = { 0, 1, 2, 2, 5, 6, 6, 8, 25, 25 };
        int[] array2 = { -2, 0, 1, 2, 2, 2, 3, 4, 5, 10, 20, 25, 25 };

        StdOut.print("Elements: ");
        findSameNum(array1, array2);
        StdOut.println("\nExpected: 0 1 2 5 25");
    }

    public static void findSameNum(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                int match = a[i];
                while (i < a.length && a[i] == match) {
                    i++;
                }
                while (j < b.length && b[j] == match) {
                    j++;
                }

                System.out.print(match + " ");
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

}
