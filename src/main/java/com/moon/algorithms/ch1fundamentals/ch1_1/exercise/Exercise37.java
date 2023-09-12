package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.std.StdRandom;
import com.moon.algorithms.util.PrintUtil;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise37 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] array = new int[m];
        int[][] count = new int[m][m];
        for (int i = 0; i < n; i++) {
            initArray(array);
            errorShuffle(array);
            for (int j = 0; j < array.length; j++) {
                count[array[j]][j] ++;
            }
        }

        PrintUtil.printTwoDimArray(count);
    }

    private static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void errorShuffle(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = StdRandom.uniformInt(n - i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}

