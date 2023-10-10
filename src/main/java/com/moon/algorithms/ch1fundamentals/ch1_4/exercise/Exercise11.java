package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_4.StaticSETofInts;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise11 {

    public static void main(String[] args) {
        int[] testArray1 = {3, 4, 4, 5, 6, 10, 15, 20, 20, 20, 20, 21};
        StaticSETofInts set = new StaticSETofInts(testArray1);
        int elementToSearch1 = 4;
        int elementToSearch2 = 20;
        int elementToSearch3 = -5;

        StdOut.println("Binary search: " + set.howMany(elementToSearch1) +
                " Expected: 2");
        StdOut.println("Binary search: " + set.howMany(elementToSearch2) +
                " Expected: 4");
        StdOut.println("Binary search: " + set.howMany(elementToSearch3) +
                " Expected: 0");
    }

}
