package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Deque;
import com.moon.algorithms.ch1fundamentals.ch1_3.DequeByDoublyLinked;
import com.moon.algorithms.ch1fundamentals.ch1_3.DequeByResizingArray;
import com.moon.algorithms.ch1fundamentals.ch1_3.RandomBag;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises34 {
    public static void main(String[] args) {
        RandomBag<Integer> rb = new RandomBag<>(15);
        for (int i = 0; i < 10; i++) {
            rb.add(i);
        }

        for (Integer i : rb) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : rb) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : rb) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (Integer i : rb) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : rb) {
            System.out.print(i + " ");
        }
    }
}
