package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;
import com.moon.algorithms.ch1fundamentals.ch1_1.BruteForceSearch;
import com.moon.algorithms.std.In;
import com.moon.algorithms.std.StdRandom;
import com.moon.algorithms.util.PrintUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise38 {

    public static void main(String[] args) {

        int[] whiteList = In.readInts("largeW.txt");
        int[] filterList = In.readInts("largeT.txt");

        testBinarySearch(whiteList, filterList);
        testBruteForceSearch(whiteList, filterList);
    }

    public static void testBinarySearch(int[] whiteList, int[] filterList) {

        long start = System.currentTimeMillis();
        Arrays.sort(whiteList);
        for (int k : filterList) {
            BinarySearch.rank(k, whiteList);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void testBruteForceSearch(int[] whiteList, int[] filterList) {

        long start = System.currentTimeMillis();
        for (int k : filterList) {
            BruteForceSearch.rank(k, whiteList);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}

