package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise29 {

    public static void main(String[] args) {

        StequeWith2Stack<Integer> steque = new StequeWith2Stack<>();
        steque.push(1);
        steque.push(2);
        steque.push(3);
        steque.enqueue(4);
        steque.enqueue(5);

        while (!steque.isEmpty()) {
            // 3 2 1 4 5
            System.out.print(steque.pop() + " ");
        }
    }

    public static class StequeWith2Stack<E> {

        private final Stack<E> left;
        private final Stack<E> right;

        public StequeWith2Stack() {
            this.left = new Stack<>();
            this.right = new Stack<>();
        }

        public boolean isEmpty() {
            return this.left.isEmpty() && this.right.isEmpty();
        }

        public int size() {
            return this.left.size() + this.right.size();
        }

        public void push(E e) {
            this.left.push(e);
        }

        public E pop() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack is Empty.");
            }

            if (!this.left.isEmpty()) {
                return this.left.pop();
            }

            while (!this.right.isEmpty()) {
                this.left.push(this.right.pop());
            }

            E rel = this.left.pop();

            while (!this.left.isEmpty()) {
                this.right.push(this.left.pop());
            }

            return rel;
        }

        public void enqueue(E e) {
            this.right.push(e);
        }
    }
}
