package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise28 {

    public static void main(String[] args) {

        StackWithOneQueue<Integer> stack = new StackWithOneQueue<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static class StackWithOneQueue<E> {

        private final Queue<E> queue;

        public StackWithOneQueue() {
            this.queue = new Queue<>();
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public int size() {
            return this.queue.size();
        }

        public void push(E e) {
            this.queue.enqueue(e);
        }

        public E pop() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack is Empty.");
            }

            for (int i = 0; i < queue.size() - 1; i++) {
                queue.enqueue(queue.dequeue());
            }

            return queue.dequeue();
        }
    }
}
