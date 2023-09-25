package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises2 {

    public static void main(String[] args) {
        String input = "it was - the best - of times - - - it  was - the - -";
        String[] options = input.split(" ");
        Stack<String> stack = new Stack<>();
        for (String op : options) {
            if ("-".equals(op)) {
                System.out.print(stack.pop() + " ");
            } else {
                stack.push(op);
            }
        }
    }
}
