package com.moon.algorithms.ch1fundamentals.ch1_3;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

import java.util.Objects;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */
public class InfixToPostfix {
    public static String infixToPostfix(String infix) {
        String[] word = infix.split(" ");
        Stack<String> op = new Stack<>();
        Stack<String> num = new Stack<>();
        for (String c : word) {
            if (isOp(c)) {
                op.push(c);
            } else if (c.equals(")")) {
                String b = num.pop();
                String a = num.pop();
                String o = op.pop();
                num.push(a + " " + b + " " + o);
            } else if (!"(".equals(c)) {
                num.push(c);
            }
        }

        return num.pop();
    }

    private static boolean isOp(String c) {
        return Objects.equals(c, "*") || Objects.equals(c, "/") || Objects.equals(c, "+") || Objects.equals(c, "-");
    }
}
