package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Chanmoey
 * @date 2023/12/13
 */
public class Exercise45 {

    public static void main(String[] args) {
        Random r = new Random();
        for (int n = 1; n < 100000000; n *= 10) {
            Set<Integer> set = new HashSet<>();
            int count = 0;
            while (true) {
                int ri = r.nextInt(n);
                count ++;
                set.add(ri);
                if (set.size() == n) {
                    System.out.printf("N is [%d], count: [%d], H_N: [%f] \n", n,  count, 1.0 * count / n);
                    break;
                }
            }
        }
    }
}
