package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.Deque;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise31 {

    public static void main(String[] args) {
        DequeWith3Stack<Integer> exercise31_dequeWith3Stacks = new DequeWith3Stack<>();
        StdOut.println("IsEmpty: " + exercise31_dequeWith3Stacks.isEmpty() + " Expected: true");

        exercise31_dequeWith3Stacks.pushLeft(1);
        exercise31_dequeWith3Stacks.pushLeft(2);
        exercise31_dequeWith3Stacks.pushLeft(3);
        exercise31_dequeWith3Stacks.pushLeft(4);

        StdOut.println(exercise31_dequeWith3Stacks.popRight());
        StdOut.println(exercise31_dequeWith3Stacks.popLeft());
        StdOut.println(exercise31_dequeWith3Stacks.popLeft());

        StdOut.println("Expected output from pop(): 1 4 3");

        exercise31_dequeWith3Stacks.pushRight(7);
        exercise31_dequeWith3Stacks.pushRight(8);

        StdOut.println("Size: " + exercise31_dequeWith3Stacks.size() + " Expected: 3");
        StdOut.println("IsEmpty: " + exercise31_dequeWith3Stacks.isEmpty() + " Expected: false");

        StdOut.println(exercise31_dequeWith3Stacks.popLeft());
        StdOut.println(exercise31_dequeWith3Stacks.popLeft());
        StdOut.println(exercise31_dequeWith3Stacks.popRight());

        StdOut.println("Expected output from pop(): 2 7 8");
    }


    public static class DequeWith3Stack<E> implements Deque<E>{

        private final Stack<E> left;
        private final Stack<E> temp;
        private final Stack<E> right;

        public DequeWith3Stack() {
            this.left = new Stack<>();
            this.temp = new Stack<>();
            this.right = new Stack<>();
        }

        @Override
        public boolean isEmpty() {
            return this.left.isEmpty() && this.right.isEmpty();
        }

        @Override
        public int size() {
            return this.left.size() + this.right.size();
        }

        @Override
        public void pushLeft(E e) {
            this.left.push(e);
        }

        @Override
        public void pushRight(E e) {
            this.right.push(e);
        }

        @Override
        public E popLeft() {
            handleEmpty();

            if (!this.left.isEmpty()) {
                return this.left.pop();
            }

            if (this.left.isEmpty() && this.size() == 1) {
                return this.right.pop();
            }

            moveHalfFromOne2Other(right, left);

            return this.left.pop();
        }

        private void moveHalfFromOne2Other(Stack<E> from, Stack<E> to) {
            int moveSize = this.size() / 2;
            int otherSize = this.size() - moveSize;

            for (int i = 0; i < otherSize; i++) {
                this.temp.push(from.pop());
            }

            for (int i = 0; i < moveSize; i++) {
                to.push(from.pop());
            }

            for (int i = 0; i < otherSize; i++) {
                from.push(temp.pop());
            }
        }

        @Override
        public E popRight() {
            handleEmpty();

            if (!this.right.isEmpty()) {
                return this.right.pop();
            }

            if (this.right.isEmpty() && this.size() == 1) {
                return this.left.pop();
            }

            moveHalfFromOne2Other(left, right);

            return this.right.pop();
        }

        private void handleEmpty() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Deque is Empty");
            }
        }
    }
}
