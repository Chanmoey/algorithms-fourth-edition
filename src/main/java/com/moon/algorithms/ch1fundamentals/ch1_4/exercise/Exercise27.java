package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise27 {

    public static void main(String[] args) {

        QueueWith2Stack<Integer> queue = new QueueWith2Stack<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            if (!queue.isEmpty() && Math.random() < 0.5) {
                System.out.println(queue.deque());
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.deque());
        }

    }

    public static class QueueWith2Stack<E>{

        private final Stack<E> input;
        private final Stack<E> output;

        public QueueWith2Stack() {
            this.input = new Stack<>();
            this.output = new Stack<>();
        }

        public boolean isEmpty() {
            return this.input.isEmpty() && this.output.isEmpty();
        }

        public int size() {
            return this.input.size() + this.output.size();
        }

        public void enqueue(E e) {
            this.input.push(e);
        }

        public E deque() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Queue is Empty.");
            }

            if (this.output.isEmpty()) {
                while (!this.input.isEmpty()) {
                    this.output.push(this.input.pop());
                }
            }

            return this.output.pop();
        }
    }
}
