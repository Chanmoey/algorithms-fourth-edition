package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Chanmoey
 * @date 2023/9/25
 */
public class RandomQueue<E> implements Iterable<E>{
    private final Random random;
    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public RandomQueue() {
        this.random = new Random();
        this.data = (E[]) new Object[8];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(E e) {
        resizeIfNeed(this.data.length << 1);
        this.data[this.size++] = e;
    }

    public E dequeue() {
        this.sample();
        E del = this.data[--this.size];
        this.data[this.size] = null; // Help GC
        resizeIfNeed(this.data.length >> 1);
        return del;
    }

    private void swap(int i, int j) {
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public E sample() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty!");
        }

        int idx = random.nextInt(this.size);
        swap(idx, this.size - 1);
        return data[this.size - 1];
    }

    @SuppressWarnings("all")
    public void resizeIfNeed(int newCap) {
        if (this.size > (this.data.length >> 2) && this.size < this.data.length) {
            return;
        }
        E[] temp = (E[]) new Object[newCap];
        if (this.size >= 0) System.arraycopy(data, 0, temp, 0, this.size);
        this.data = temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new RandomQueueIterator();
    }

    private class RandomQueueIterator implements Iterator<E>{

        private int idx = size - 1;
        private final Random random = new Random();

        @Override
        public boolean hasNext() {
            return idx >= 0;
        }

        @Override
        public E next() {
            int swapIdx = random.nextInt(idx + 1);
            swap(idx, swapIdx);
            return data[idx--];
        }
    }
}
