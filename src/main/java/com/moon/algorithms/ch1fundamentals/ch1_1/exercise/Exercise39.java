package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;
import com.moon.algorithms.ch1fundamentals.ch1_1.BruteForceSearch;
import com.moon.algorithms.std.In;
import com.moon.algorithms.std.StdRandom;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise39 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n = new int[]{1000, 10000, 100000, 1000000};

        for (int scale : n) {
            int totalCount = 0;
            for (int i = 0; i < t; i++) {
                int[] arr1 = new int[scale];
                int[] arr2 = new int[scale];
                initRandomArray(arr1);
                initRandomArray(arr2);
                Arrays.sort(arr1);
                int count = 0;
                for (int key : arr2) {
                    if (BinarySearch.rank(key, arr1) > 0) {
                        count++;
                    }
                }
                totalCount += count;
            }
            System.out.println("Scale: " + scale + ", mean is: " + 1.0 * totalCount / t);
        }
    }

    private static void initRandomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniformInt(100000, 1000000);
        }
    }

}

