package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/27
 */
public class GeneralizedQueueByLinkedList<E> {

    private class Node{
        private final E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }
    }

    private final Node dummyHead;
    private int size;

    public GeneralizedQueueByLinkedList() {
        this.size = 0;
        this.dummyHead = new Node(null);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insert(E e) {
        Node newNode = new Node(e);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        this.size++;
    }

    public E delete(int k) {
        if (k >= this.size) {
            throw new IllegalArgumentException("The k is greater than the size of queue!");
        }
        //          0    1    2
        // dummy -> 1 -> 2 -> 3 -> 4, delete 2th node(index start from 0)
        Node prev = dummyHead;
        for (int i = 0; i < k; i++) {
            prev = prev.next;
        }

        Node del = prev.next;
        prev.next = del.next; // delete del node
        del.next = null; // Help GC
        this.size --;
        return del.e;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return " -> ";
        }

        StringBuilder sb = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }

        return sb.toString();
    }
}
