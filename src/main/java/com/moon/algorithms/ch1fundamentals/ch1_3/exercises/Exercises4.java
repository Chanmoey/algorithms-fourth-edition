package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;
import com.moon.algorithms.std.In;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises4 {

    public static void main(String[] args) {

        In in = new In();
        Stack<Character> stack = new Stack<>();
        boolean isBalance = true;
        while (in.hasNextChar()) {
            char c = in.readChar();
            if ('\n' == c) {
                break;
            }
            if ('[' == c || '(' == c || '{' == c) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    isBalance = false;
                    break;
                }
                char top = stack.pop();
                if (top == '(' && c != ')') {
                    isBalance = false;
                    break;
                } else if (top == '{' && c != '}') {
                    isBalance = false;
                    break;
                } else if (top == '[' && c != ']') {
                    isBalance = false;
                    break;
                }
            }
        }
        if (isBalance) {
            isBalance = stack.isEmpty();
        }
        System.out.println(isBalance);
    }
}
