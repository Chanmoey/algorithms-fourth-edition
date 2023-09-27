package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises42 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        Stack<Integer> r = new Stack<>(s);
        System.out.println(r);
        System.out.println(s);

        while (!r.isEmpty()) {
            System.out.println(r.pop() + " " + s.pop());
        }
    }
}
