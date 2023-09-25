package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;
import com.moon.algorithms.std.In;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises6 {

    public static void main(String[] args) {
        // reverse the element which in the queue
        Queue<String> q = new Queue<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(String.valueOf(i));
        }
        System.out.println(q);

        Stack<String> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.dequeue());
        }
        while (!stack.isEmpty()) {
            q.enqueue(stack.pop());
        }
        System.out.println(q);
    }
}
