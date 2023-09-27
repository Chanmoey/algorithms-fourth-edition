package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/27
 */
public class GeneralizedQueueByArray<E> {

    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public GeneralizedQueueByArray() {
        this.size = 0;
        this.data = (E[]) new Object[8];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insert(E e) {
        resizingIfNeed(data.length << 1);
        data[size++] = e;
    }

    public void delete(int k) {
        if (k >= size) {
            throw new IllegalArgumentException("kth must be small than queue's size");
        }

        for (int i = size - k; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null; // Help GC

        resizingIfNeed(data.length >> 1);
    }

    @SuppressWarnings("unchecked")
    private void resizingIfNeed(int newCap) {
        if (size > data.length >> 2 && size < data.length) {
            return;
        }
        E[] temp = (E[]) new Object[newCap];
        System.arraycopy(data, 0, temp, 0, size);
        this.data = temp;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(data[i]);
            if (i != 0) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
