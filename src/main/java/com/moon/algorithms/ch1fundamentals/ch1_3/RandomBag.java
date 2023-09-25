package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Chanmoey
 * @date 2023/9/25
 */
public class RandomBag<E> implements Iterable<E>{

    private int size;
    private E[] data;

    @SuppressWarnings("unchecked")
    public RandomBag(int cap) {
         this.data = (E[]) new Object[cap];
         this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void add(E e) {
        resizeIfNeed(this.data.length << 1);
        this.data[this.size++] = e;
    }

    @SuppressWarnings("unchecked")
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
        return new RandomBagIterator();
    }

    private class RandomBagIterator implements Iterator<E> {
        private int idx = 0;
        public RandomBagIterator() {
            Random random = new Random();
            for (int i = size - 1; i >= 0; i--) {
                swap(data, i, random.nextInt(size - i));
            }
        }

        private void swap(E[] data, int i, int j) {
            E t = data[i];
            data[i] = data[j];
            data[j] = t;
        }

        @Override
        public boolean hasNext() {
            return idx < size;
        }

        @Override
        public E next() {
            return data[idx++];
        }
    }
}
