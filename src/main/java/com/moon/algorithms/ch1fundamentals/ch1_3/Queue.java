package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class Queue<E> {

    private class Node {
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node first;
    private Node last;
    private int n;

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    /**
     * enqueue by add a node to the end of the list
     */
    public void enqueue(E e) {
        Node oldLast = last;
        last = new Node(e);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        this.n++;
    }

    /**
     * dequeue by remove the node which start of the list
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty!");
        }

        Node del = first;
        first = first.next;
        E e = del.e;
        del.next = null; // Help GC
        // list is empty
        if (first == null) {
            last = null;
        }
        this.n--;
        return e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = first;
        while (cur != null) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }
        return sb.toString();
    }
}
