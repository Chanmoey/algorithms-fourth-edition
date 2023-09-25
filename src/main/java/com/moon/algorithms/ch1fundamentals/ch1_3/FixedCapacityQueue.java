package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Chanmoey
 * @date 2023/9/18
 */
public class FixedCapacityQueue<E> implements Iterable<E>{

    private E[] a;
    private int n;
    /**
     * the start index of queue head
     */
    private int top;
    /**
     * the last index of queue tail
     */
    private int tail;

    /**
     * top     tail
     * 0 1 2 3 4 nil nil nil
     */

    @SuppressWarnings("unchecked")
    public FixedCapacityQueue(int cap) {
        this.a = (E[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void enqueue(E item) {
        if (n == a.length) {
            resize(a.length << 1);
        }

        this.tail = nextTail(tail);
        a[tail] = item;
        this.n ++;
    }

    private int nextTail(int tail) {
        tail = tail + 1;
        if (tail >= a.length) {
            tail = 0;
        }
        return tail;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        E e = a[top];
        this.top = nextTop(top);
        this.n --;
        return e;
    }

    private int nextTop(int top) {
        top = top + 1;
        if (top >= a.length) {
            top = 0;
        }
        return top;
    }

    @SuppressWarnings("unchecked")
    private void resize(int max) {
        E[] temp = (E[]) new Object[max];
        for (int i = 0; i < n; i++) {
            temp[i] = a[top];
            top = nextTop(top);
        }
        a = temp;
        top = 0;
        tail = n - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e : this) {
            sb.append(e).append(" -> ");
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new OrderedArrayIterator();
    }

    private class OrderedArrayIterator implements Iterator<E> {
        private int count = 0;
        private int i = top;

        @Override
        public boolean hasNext() {
            return count < n;
        }

        @Override
        public E next() {
            count++;
            E e = a[i];
            i = nextTop(i);
            return e;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
