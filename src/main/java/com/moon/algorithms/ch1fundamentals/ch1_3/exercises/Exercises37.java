package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.RandomQueue;
import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < n; i++) {
            queue.enqueue(i);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < m; i++) {
                queue.enqueue(queue.dequeue());
            }
            // kill this person
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        System.out.println("Only One Person is Left: " + queue.dequeue());
    }
}
