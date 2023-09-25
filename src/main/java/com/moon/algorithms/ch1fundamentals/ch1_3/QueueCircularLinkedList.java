package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class QueueCircularLinkedList<E> {

    private class Node {
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
    }

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
        if (isEmpty()) {
            last = new Node(e);
            last.next = last;
        } else {
            Node first = last.next;
            last.next = new Node(e, first);
            last = last.next;
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

        Node del = last.next;
        E e = del.e;

        if (size() == 1) {
            last = null;
        } else {
            last.next = del.next;
        }

        del.next = null; // Help GC
        this.n--;
        return e;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        Node first = last.next;
        Node cur = last.next;
        sb.append(cur.e).append(" -> ");
        cur = cur.next;
        while (cur != first) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }
        return sb.toString();
    }
}
