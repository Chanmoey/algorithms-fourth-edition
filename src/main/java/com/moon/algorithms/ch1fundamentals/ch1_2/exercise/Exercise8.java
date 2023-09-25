package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise8 {

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        int[] t = a;
        a = b;
        b = t;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    /**
     * reverse a string
     */
    public static String mystery(String s)
    {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}
