package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.In;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class Exercise15 {
    // See SmartDate

    public static void main(String[] args) {
        // See Transaction
        int[] ints = readInts("tinyW.txt");
        System.out.println(Arrays.toString(ints));
    }

    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
}