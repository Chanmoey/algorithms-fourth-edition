package com.moon.algorithms.util;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */
public class ListNode<T>{

    private final T v;
    private ListNode<T> next;

    public ListNode(T v, ListNode<T> next) {
        this.v = v;
        this.next = next;
    }

    public T getV() {
        return v;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
