package com.moon.algorithms.ch1fundamentals.ch1_3;


/**
 * Using two stack, input stack and output stack
 *
 * @author Chanmoey
 * @date 2023/10/4
 */
public class QueueBaseStack<E> {

    private final Stack<E> input;

    private final Stack<E> output;

    public QueueBaseStack() {
        this.input = new Stack<>();
        this.output = new Stack<>();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public int size() {
        return input.size() + output.size();
    }

    public void enqueue(E e) {
        this.input.push(e);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty!");
        }

        if (this.output.isEmpty()) {
            while (!this.input.isEmpty()) {
                this.output.push(this.input.pop());
            }
        }

        return this.output.pop();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty!");
        }
        if (this.output.isEmpty()) {
            while (!this.input.isEmpty()) {
                this.output.push(this.input.pop());
            }
        }

        return this.output.peek();
    }
}
