package com.moon.algorithms.util;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class PrintUtil {

    public static void printTwoDimArray(double[][] array) {
        for (double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printTwoDimArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
