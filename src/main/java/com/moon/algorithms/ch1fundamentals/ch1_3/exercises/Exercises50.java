package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;


/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises50 {
    public static void main(String[] args) throws InterruptedException {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (Integer integer : stack) {
            stack.pop();
            System.out.println(integer);
        }
    }
}
