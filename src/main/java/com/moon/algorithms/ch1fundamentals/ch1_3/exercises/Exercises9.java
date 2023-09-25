package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises9 {
    public static void main(String[] args) {
        String input = "1 + 2 ) * 3 - 4 ) * 5- 6 ) ) )";
        Stack<Character> op = new Stack<>();
        Stack<String> num = new Stack<>();

        for (char c : input.toCharArray()) {
            if (isNumber(c)) {
                num.push(String.valueOf(c));
            } else if (c == ')') {
                char o = op.pop();
                String b = num.pop();
                String a = num.pop();
                // ( num a + op + num b ) become a new number
                num.push("( " + a + " " + o + " " + b + " )");
            } else if (c != ' '){
                op.push(c);
            }
        }

        System.out.println(num.pop());
    }

    private static boolean isNumber(char c) {
        return c - '0' >= 0 && c - '0' <= 9;
    }
}
