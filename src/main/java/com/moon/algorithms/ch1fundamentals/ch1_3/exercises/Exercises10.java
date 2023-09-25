package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.InfixToPostfix;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises10 {
    public static void main(String[] args) {
        String line1 = "( ( 2 + 1 ) * 3 )";
        System.out.println(InfixToPostfix.infixToPostfix(line1));
        String line2 = "( 4 + ( 13 / 5 ) )";
        System.out.println(InfixToPostfix.infixToPostfix(line2));
    }
}
