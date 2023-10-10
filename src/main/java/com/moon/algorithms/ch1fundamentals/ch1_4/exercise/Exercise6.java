package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise6 {

    public static void main(String[] args) {
        // a ~ N
        System.out.println(a(100000));

        // b ~ N
        System.out.println(b(100000));

        // c ~ NlogN
        System.out.println(c(100000));
    }

    public static int a(int N) {
        int sum = 0;
        for (int n = N; n > 0; n /= 2) {
            for (int i = 0; i < n; i++) {
                sum++;
            }
        }
        return sum;
    }

    public static int b(int N) {
        int sum = 0;
        for (int i = 1; i < N; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static int c(int N) {
        int sum = 0;
        for (int i = 1; i < N; i *= 2) {
            for (int j = 0; j < N; j++) {
                sum++;
            }
        }
        return sum;
    }
}
