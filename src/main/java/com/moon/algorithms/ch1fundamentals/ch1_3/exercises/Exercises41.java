package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.MoveToFront;
import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises41 {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        Queue<Integer> r = new Queue<>(q);
        System.out.println(r);
        System.out.println(q);

        while (!r.isEmpty()) {
            System.out.println(r.dequeue() + " " + q.dequeue());
        }
    }
}
