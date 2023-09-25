package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises15 {
    public static void main(String[] args) {

        int k =  3;
        Queue<String> queue = new Queue<>();
        for (int i = 0; i < 100; i++) {
            if (queue.size() >= k) {
                queue.dequeue();
            }
            queue.enqueue(String.valueOf(i));
        }

        System.out.println(queue.dequeue());
    }
}
