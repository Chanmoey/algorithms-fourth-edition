package com.moon.algorithms.ch1fundamentals.ch1_3;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

import java.util.Objects;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */
public class EvaluatePostfix {

    public static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        for (String s : postfix.split(" ")) {
            if (isOp(s)) {
                double b = stack.pop();
                double a = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Double.parseDouble(s));
            }
        }

        return stack.pop();
    }

    private static boolean isOp(String c) {
        return Objects.equals(c, "*") || Objects.equals(c, "/") || Objects.equals(c, "+") || Objects.equals(c, "-");
    }
}
