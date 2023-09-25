package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/25
 */
public class DequeByResizingArray<E> implements Deque<E>{

    private E[] data;
    private int size;
    private int left;
    private int right;

    @SuppressWarnings("unchecked")
    public DequeByResizingArray(int capacity) {
        this.data = (E[]) new DequeByDoublyLinked[capacity];
        this.size = 0;
        this.left = -1;
        this.right = -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void pushLeft(E e) {
        resizeIfNeed(this.data.length << 1);
        this.left = decreaseIdx(left);
        this.data[this.left] = e;
        this.size++;
    }

    @Override
    public void pushRight(E e) {
        resizeIfNeed(this.data.length << 1);
        this.right = increaseIdx(right);
        this.data[this.right] = e;
        this.size++;
    }

    @Override
    public E popLeft() {
        E del = this.data[this.left];
        this.left = increaseIdx(this.left);
        this.size--;
        resizeIfNeed(this.data.length >> 1);
        return del;
    }

    @Override
    public E popRight() {
        E del = this.data[this.right];
        this.right = decreaseIdx(this.right);
        this.size--;
        resizeIfNeed(this.data.length >> 1);
        return del;
    }

    @SuppressWarnings("unchecked")
    private void resizeIfNeed(int size) {
        // no need to resize
        if (this.size > (this.data.length >> 2) && this.size < this.data.length) {
            return;
        }
        E[] temp = (E[]) new Object[size];
        for (int i = 0; i < this.size; i++) {
            temp[i] = data[left];
            left = increaseIdx(left);
        }
        this.left = 0;
        this.right = this.size - 1;
        this.data = temp;
    }

    private int increaseIdx(int idx) {
        idx ++;
        if (idx >= this.data.length) {
            idx = 0;
        }
        return idx;
    }

    private int decreaseIdx(int idx) {
        idx --;
        if (idx < 0) {
            idx = this.data.length - 1;
        }
        return idx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int idx = this.left;
        for (int i = 0; i < this.size; i++) {
            sb.append(this.data[idx]);
            idx = increaseIdx(idx);
            if (i != this.size - 1) {
                sb.append(", ");
            }
        }

        sb.append(']');

        return sb.toString();
    }
}
