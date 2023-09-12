package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.std.StdRandom;
import com.moon.algorithms.util.PrintUtil;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise36 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] array = new int[m];
        int[][] count = new int[m][m];
        for (int i = 0; i < n; i++) {
            initArray(array);
            StdRandom.shuffle(array);
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

    public static void shuffle(double[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i++)
        { // 将 a[i] 和 a[i..N-1] 中任意一个元素交换
            int r = i + StdRandom.uniform(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}

