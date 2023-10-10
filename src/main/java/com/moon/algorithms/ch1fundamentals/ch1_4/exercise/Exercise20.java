package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise20 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        System.out.println(bitonicSearch(arr, 0));
        System.out.println(bitonicSearch(arr, 1));
        System.out.println(bitonicSearch(arr, 6));
        System.out.println(bitonicSearch(arr, 5));
        System.out.println(bitonicSearch(arr, 9));
        System.out.println(bitonicSearch(arr, 10));

    }

    public static boolean bitonicSearch(int[] arr, int target) {
        int topIdx = findTopIdx(arr);
        if (arr[topIdx] == target) {
            return true;
        }

        return (rank(arr, 0, topIdx - 1, target) + rankReverse(arr, topIdx + 1, arr.length - 1, target)) > -2;
    }

    private static int findTopIdx(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                hi = mid - 1;
            } else {
                throw new IllegalArgumentException("No Bitonic Array");
            }
        }
        throw new IllegalArgumentException("No Bitonic Array");
    }

    // [lo, hi]
    private static int rank(int[] arr, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    private static int rankReverse(int[] arr, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }
}
