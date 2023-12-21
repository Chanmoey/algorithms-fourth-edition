package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Chanmoey
 * @date 2023/12/13
 */
public class Exercise44 {

    public static void main(String[] args) {
        Random r = new Random();
        for (int n = 1; n < 100000000; n *= 10) {
            Set<Integer> set = new HashSet<>();
            int count = 0;
            while (true) {
                int ri = r.nextInt(n);
                count++;
                if (set.contains(ri)) {
                    System.out.printf("N is [%d], sqrt(PI * N/2): [%f], count: [%d] \n", n, Math.sqrt(Math.PI * n / 2), count);
                    break;
                }
                set.add(ri);
            }
        }
    }
}
