package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.RandomQueue;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises35 {
    public static void main(String[] args) {
        RandomQueue<Integer> rq = new RandomQueue<>();
        for (int i = 0; i < 10; i++) {
            rq.enqueue(i);
        }

        System.out.println(rq.sample());
        System.out.println(rq.dequeue());
    }
}
