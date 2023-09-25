package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.QueueCircularLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises29 {
    public static void main(String[] args) {
        QueueCircularLinkedList<Integer> queue = new QueueCircularLinkedList<>();
        List<Integer> dequeue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.5 && !queue.isEmpty()) {
                dequeue.add(queue.dequeue());
            }
            queue.enqueue(i);
            System.out.println("queue: " + queue);
        }
        while (!queue.isEmpty()) {
            dequeue.add(queue.dequeue());
            System.out.println("queue: " + queue);
        }

        System.out.println(dequeue);
    }
}
