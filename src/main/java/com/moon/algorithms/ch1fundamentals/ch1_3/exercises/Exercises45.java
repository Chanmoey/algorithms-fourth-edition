package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Buffer;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises45 {
    public static void main(String[] args) {
        // a. 4 3 2 1 0 9 8 7 6 5
        // b. 4 6 8 7 5 3 2 9 0 1
        // c. 2 5 6 7 4 8 9 3 1 0
        // d. 4 3 2 1 0 5 6 7 8 9
        // e. 1 2 3 4 5 6 9 8 7 0
        // f. 0 4 6 5 3 8 1 7 2 9
        // g. 1 4 7 9 8 6 5 3 0 2
        // h. 2 1 4 3 6 5 8 7 9 0
        System.out.println(stackGenerability("4 3 2 1 0 9 8 7 6 5", 10));
        System.out.println(stackGenerability("4 6 8 7 5 3 2 9 0 1", 10));
        System.out.println(stackGenerability("2 5 6 7 4 8 9 3 1 0", 10));
        System.out.println(stackGenerability("4 3 2 1 0 5 6 7 8 9", 10));
        System.out.println(stackGenerability("1 2 3 4 5 6 9 8 7 0", 10));
        System.out.println(stackGenerability("0 4 6 5 3 8 1 7 2 9", 10));
        System.out.println(stackGenerability("1 4 7 9 8 6 5 3 0 2", 10));
        System.out.println(stackGenerability("2 1 4 3 6 5 8 7 9 0", 10));
    }

    public static boolean stackGenerability(String permutation, int n) {
        Stack<String> stack = new Stack<>();
        String[] word = permutation.split(" ");
        int idx = 0;
        for (int i  = 0; i < n; i++) {
            stack.push(String.valueOf(i));
            while (!stack.isEmpty() && stack.peek().equals(word[idx])) {
                stack.pop();
                idx++;
            }
        }

        return stack.isEmpty();
    }
}
