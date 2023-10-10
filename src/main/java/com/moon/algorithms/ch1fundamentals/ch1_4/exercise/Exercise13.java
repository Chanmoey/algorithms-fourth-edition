package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise13 {

    public static void main(String[] args) {
        // Accumulator 16 head + 8 double + 8 double + 4 int + 4 padding = 40 bytes

        // Transaction 16 head + 8 string reference + 8 data reference + 8 double = 40 bytes

        // FixedCapacityStackOfStrings
        // 1. 16 head + 8 ref(array) + 4 int(n) + 4 padding = 32 bytes
        // 2. String[] 16 head + 4 len + 4 padding = 24 bytes + 8 * C = 24 + 8C
        // 3. N String N * (16 head + 8 ref + 4 off + 4 count + 4 hash + 4 padding + {char[] 16 head + 4 len + 4 padding + 2*count})
        // amount = 56 + 8C + 64N + 2*(char count) * N
    }
}
