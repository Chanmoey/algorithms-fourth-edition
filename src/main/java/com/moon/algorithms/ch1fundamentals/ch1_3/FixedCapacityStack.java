package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Chanmoey
 * @date 2023/9/18
 */
public class FixedCapacityStack<E> implements Iterable<E>{

    private E[] a;
    private int n;

    @SuppressWarnings("unchecked")
    public FixedCapacityStack(int cap) {
        this.a = (E[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(E item) {
        if (n == a.length) {
            resize(a.length << 1);
        }
        a[n++] = item;
    }

    public E pop() {
        E e = a[--n];
        a[n] = null; // Help GC
        if (n > 0 && n <= (a.length >> 2)) {
            resize(a.length >> 1);
        }

        return e;
    }

    @SuppressWarnings("unchecked")
    private void resize(int max) {
        E[] temp = (E[]) new Object[max];
        System.arraycopy(a, 0, temp, 0, n);
        a = temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReverserArrayIterator();
    }

    private class ReverserArrayIterator implements Iterator<E> {
        private int i = n;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public E next() {
            if (i < 0) {
                throw new NoSuchElementException();
            }
            return a[--i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
