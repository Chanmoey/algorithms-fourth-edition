package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.GeneralizedQueueByArray;
import com.moon.algorithms.ch1fundamentals.ch1_3.GeneralizedQueueByLinkedList;
import com.moon.algorithms.ch1fundamentals.ch1_3.RingBuffer;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises39 {
    public static void main(String[] args) {

        RingBuffer<Integer> ringBuffer = new RingBuffer<>(10);
        for (int i = 0; i < 15; i++) {
            ringBuffer.enqueue(i);
            if (Math.random() < 0.5 && !ringBuffer.isEmpty()) {
                ringBuffer.dequeue();
            }
            System.out.println(ringBuffer);
        }
    }
}
