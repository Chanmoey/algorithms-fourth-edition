package com.moon.algorithms.ch1fundamentals.ch1_3;

import com.moon.algorithms.ch1fundamentals.ch1_3.DoublyLinkedList;

/**
 * @author Chanmoey
 * @date 2023/9/25
 */
public class DequeByDoublyLinked<E> implements Deque<E> {

    private DoublyLinkedList<E> list = new DoublyLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void pushLeft(E e) {
        list.addFirst(e);
    }

    @Override
    public void pushRight(E e) {
        list.addLast(e);
    }

    @Override
    public E popLeft() {
        return list.removeFirst();
    }

    @Override
    public E popRight() {
        return list.removeLast();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
