package com.moon.algorithms.ch1fundamentals.ch1_1;

import com.moon.algorithms.ch1fundamentals.ch1_2.Counter;
import com.moon.algorithms.std.In;
import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdIn;
import com.moon.algorithms.std.StdOut;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/7
 */
public class BinarySearch {

    /**
     * find key in array(a), if array(a) contain key, return the index of key, else return -1;
     * {page 47}
     * @param key key
     * @param a array
     * @return -1 if array not contain key; else return the index of key
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        // find key in arr[lo, hi]
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        // find key in arr[lo, hi]
        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    /**
     * {page 25}
     */
    public static int rankRecursive(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        String sb = "-".repeat(Math.max(0, depth)) +
                "lo: " + lo + " " +
                "hi: " + hi;
        System.out.println(sb);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]){
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }
}
