package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise22 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 16, 17, 20, 24, 31, 43, 50, 62};
        System.out.println(fibonacciSearch(arr, 1));
    }

    public static int fibonacciSearch(int[] arr, int key) {
        int n = arr.length;
        int fm2 = 0;
        int fm1 = 1;
        int fm = 0;
        while (fm < n) {
            fm = fm1 + fm2;
            fm2 = fm1;
            fm1 = fm;
        }

        fm1 = fm2;
        fm2 = fm - fm1;

        int offset = -1;
        while (fm > 1) {
            int idx = Math.min(offset + fm2, n - 1);
            if (arr[idx] == key) {
                return idx;
            } else if (arr[idx] < key) {
                offset = idx;
                fm = fm1;
                fm1 = fm2;
                fm2 = fm - fm1;
            } else {
                fm = fm2;
                fm1 = fm1 - fm2;
                fm2 = fm - fm1;
            }
        }

        if (fm1 == 1 && arr[offset + 1] == key) {
            return offset + 1;
        }

        return -1;
    }
}
