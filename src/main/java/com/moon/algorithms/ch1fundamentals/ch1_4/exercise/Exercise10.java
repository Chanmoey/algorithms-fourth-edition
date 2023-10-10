package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise10 {

    public static void main(String[] args) {
        int[] testArray1 = {3, 4, 4, 5, 6, 10, 15, 20, 20, 20, 20, 21};
        int elementToSearch1 = 4;
        int elementToSearch2 = 20;
        int elementToSearch3 = -5;

        StdOut.println("Binary search: " + binarySearch(testArray1, elementToSearch1) +
                " Expected: 1");
        StdOut.println("Binary search: " + binarySearch(testArray1, elementToSearch2) +
                " Expected: 7");
        StdOut.println("Binary search: " + binarySearch(testArray1, elementToSearch3) +
                " Expected: -1");

        int[] testArray2 = {4, 4, 4, 4, 4, 4, 15, 20, 20, 20, 20, 21};
        int elementToSearch4 = 4;

        StdOut.println("Binary search: " + binarySearch(testArray2, elementToSearch4) +
                " Expected: 0");
    }

    private static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                while (mid >= 0 && a[mid] == key) {
                    mid--;
                }
                return mid + 1;
            } else if (a[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }

}
