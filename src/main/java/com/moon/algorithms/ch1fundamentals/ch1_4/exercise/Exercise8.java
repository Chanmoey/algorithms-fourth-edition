package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise8 {

    public static void main(String[] args) {

        int[] values1 = {1, 2, 4, 1, 2, 1, 2, 4, 5, 1, 2, 4, 5, 1, 2 ,5, 6, 7, 7, 8, 2, 1, 2, 4, 5};
        StdOut.println("Equal pairs 1: " + countNumberOfPairs(values1) + " Expected: 49");
        StdOut.println("Equal pairs 1: " + countNumberOfPairsMap(values1) + " Expected: 49");

        int[] values2 = {1, 1, 1};
        StdOut.println("Equal pairs 2: " + countNumberOfPairs(values2) + " Expected: 3");
        StdOut.println("Equal pairs 2: " + countNumberOfPairsMap(values2) + " Expected: 3");
    }

    private static int countNumberOfPairs(int[] values) {
        Arrays.sort(values);
        int count = 0;
        int freq = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] == values[i]) {
                freq++;
            } else {
                if (freq > 1) {
                    count += freq * (freq - 1) / 2;
                    freq = 1;
                }
            }
        }

        if (freq > 1) {
            count += freq * (freq - 1) / 2;
        }

        return count;
    }

    private static int countNumberOfPairsMap(int[] values) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : values) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        int count = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                count += value * (value - 1) / 2;
            }
        }

        return count;
    }
}
