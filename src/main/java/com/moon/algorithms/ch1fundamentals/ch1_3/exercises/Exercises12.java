package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises12 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("I");
        stack.push("Love");
        stack.push("Algo");

        Stack<String> clone = Stack.clone(stack);
        System.out.println(stack);
        System.out.println(clone);
    }
}
