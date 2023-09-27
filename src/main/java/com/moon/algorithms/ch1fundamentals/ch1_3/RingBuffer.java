package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Arrays;

/**
 * RingBuffer, in this implementation the size of data array can not be change after init;
 *
 * @author Chanmoey
 * @date 2023/9/27
 */
public class RingBuffer<E> {

    private int top;
    private int tail;
    private int size;
    private final E[] data;

    @SuppressWarnings("unchecked")
    public RingBuffer(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.top = -1;
        this.tail = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(E e) {
        if (this.size == this.data.length) {
            throw new IllegalArgumentException("The queue is full!");
        }
        this.tail = inc(this.tail);
        this.data[this.tail] = e;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("The queue is empty!");
        }
        E del = this.data[this.top];
        this.data[this.top] = null; // Help GC
        this.top = inc(this.top);

        return del;
    }

    public int inc(int idx) {
        idx = idx + 1;
        if (idx >= this.data.length) {
            idx = 0;
        }
        return idx;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }
}
