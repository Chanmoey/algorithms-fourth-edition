package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;
import com.moon.algorithms.ch1fundamentals.ch1_2.Counter;
import com.moon.algorithms.std.In;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise9 {

    public static void main(String[] args) {
        In in = new In("largeW.txt");
        int[] ints = in.readAllInts();
        Counter counter = new Counter("counter");
        BinarySearch.rank(1000, ints, counter);
        StdOut.println(counter);
    }
}
