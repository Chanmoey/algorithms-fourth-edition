package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises13 {
    public static void main(String[] args) {

        // b c d could not occur
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.5 && !queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");
            } else {
                queue.enqueue(i);
            }

            while (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");
            }
        }
    }
}
