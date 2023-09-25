package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;
import com.moon.algorithms.std.In;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises5 {

    public static void main(String[] args) {
        In in = new In();
        int n = in.readInt();
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n >>= 1;
        }

        for (int d : stack) {
            // 110010
            System.out.print(d);
        }
    }
}
