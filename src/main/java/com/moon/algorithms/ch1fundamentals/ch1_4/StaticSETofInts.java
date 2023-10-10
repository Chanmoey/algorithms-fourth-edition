package com.moon.algorithms.ch1fundamentals.ch1_4;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class StaticSETofInts {
    protected final int[] a;

    public StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        // defensive copy
        System.arraycopy(keys, 0, a, 0, keys.length);
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {  // Binary search.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public int howMany(int key) {
        int rank = rank(key);
        if (rank == -1) {
            return 0;
        }

        int count = 1;
        int l = rank - 1;
        int r = rank + 1;
        while (l >= 0 && l < a.length) {
            if (a[l] != key && a[r] != key) {
                break;
            }
            if (a[l] == key) {
                count++;
                l--;
            }
            if (a[r] == key) {
                count++;
                r++;
            }
        }

        return count;
    }
}
