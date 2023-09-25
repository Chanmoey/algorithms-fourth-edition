package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.EvaluatePostfix;
import com.moon.algorithms.ch1fundamentals.ch1_3.InfixToPostfix;
import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises11 {
    public static void main(String[] args) {
        String line1 = "( ( 2 + 1 ) * 3 )";
        String line2 = "( 4 + ( 13 / 5 ) )";
        String[] inputStream = new String[]{line1, line2};
        Queue<String> pipeline = new Queue<>();
        for (String input : inputStream) {
            pipeline.enqueue(InfixToPostfix.infixToPostfix(input));
            System.out.println(EvaluatePostfix.evaluatePostfix(pipeline.dequeue()));
        }
    }
}
