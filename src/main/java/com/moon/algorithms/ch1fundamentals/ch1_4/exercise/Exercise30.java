package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.Deque;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;
import com.moon.algorithms.ch1fundamentals.ch1_3.Steque;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise30 {

    public static void main(String[] args) {
        DequeWithStackAndSteque<Integer> dequeWithStackAndSteque = new DequeWithStackAndSteque<>();
        StdOut.println("IsEmpty: " + dequeWithStackAndSteque.isEmpty() + " Expected: true");

        dequeWithStackAndSteque.pushLeft(1);
        dequeWithStackAndSteque.pushLeft(2);
        dequeWithStackAndSteque.pushLeft(3);
        dequeWithStackAndSteque.pushLeft(4);

        StdOut.println(dequeWithStackAndSteque.popRight());
        StdOut.println(dequeWithStackAndSteque.popLeft());
        StdOut.println(dequeWithStackAndSteque.popLeft());

        StdOut.println("Expected output from pop(): 1 4 3");

        dequeWithStackAndSteque.pushRight(7);
        dequeWithStackAndSteque.pushRight(8);

        StdOut.println("Size: " + dequeWithStackAndSteque.size() + " Expected: 3");
        StdOut.println("IsEmpty: " + dequeWithStackAndSteque.isEmpty() + " Expected: false");

        StdOut.println(dequeWithStackAndSteque.popLeft());
        StdOut.println(dequeWithStackAndSteque.popLeft());
        StdOut.println(dequeWithStackAndSteque.popRight());

        StdOut.println("Expected output from pop(): 2 7 8");

    }


    public static class DequeWithStackAndSteque<E> implements Deque<E> {

        private final Stack<E> stack;
        private final Steque<E> steque;

        public DequeWithStackAndSteque() {
            this.stack = new Stack<>();
            this.steque = new Steque<>();
        }

        @Override
        public boolean isEmpty() {
            return this.stack.isEmpty() && this.steque.isEmpty();
        }

        @Override
        public int size() {
            return this.stack.size() + this.steque.size();
        }

        @Override
        public void pushLeft(E e) {
            this.stack.push(e);
        }

        @Override
        public void pushRight(E e) {
            this.steque.push(e);
        }

        @Override
        public E popLeft() {
            handleEmpty();

            if (!this.stack.isEmpty()) {
                return this.stack.pop();
            }

            if (this.stack.isEmpty() && size() == 1) {
                return this.steque.pop();
            }

            moveHalfFromSteque2Stack();

            return this.stack.pop();
        }

        private void moveHalfFromSteque2Stack() {
            int moveSize = size() / 2;
            int otherSize = size() - moveSize;

            for (int i = 0; i < otherSize; i++) {
                steque.enqueue(steque.pop());
            }

            for (int i = 0; i < moveSize; i++) {
                this.stack.push(steque.pop());
            }
        }

        @Override
        public E popRight() {
            handleEmpty();

            if (!this.steque.isEmpty()) {
                return this.steque.pop();
            }

            if (this.steque.isEmpty() && size() == 1) {
                return this.stack.pop();
            }

            while (!stack.isEmpty()) {
                steque.push(stack.pop());
            }

            return steque.pop();
        }

        private void handleEmpty() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Deque is Empty");
            }
        }
    }
}
