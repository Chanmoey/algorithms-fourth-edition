package com.moon.algorithms.ch1fundamentals.ch1_3;

import org.w3c.dom.Node;

/**
 * public class Steque<E>
 * ----------------------------------------------------------
 *  void push()        add an element to the stack head
 *  E    pop()         remove an element from the stack head
 *  void enqueue()     add an element to the stack but tail
 *
 * @author Chanmoey
 * @date 2023/9/25
 */
public class Steque<E> {

    private class Node{
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }
    }

    private final Node dummyHead = new Node(null);
    private Node last;

    private int size;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void push(E e) {
        Node node = new Node(e);
        node.next = dummyHead.next;
        dummyHead.next = node;
        if (last == null) {
            last = node;
        }
        this.size++;
    }

    public E pop() {
        Node del = dummyHead.next;
        if (del == null) {
            return null;
        }

        dummyHead.next = del.next;
        del.next = null; // Help GC;
        if (del == last) {
            last = null;
        }
        this.size--;

        return del.e;
    }

    public void enqueue(E e) {
        Node node = new Node(e);
        if (last == null) {
            dummyHead.next = node;
            last = node;
        } else {
            last.next = node;
            last = last.next;
        }

        this.size++;
    }

    @Override
    public String toString() {
        if (dummyHead.next == null) {
            return "->";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("stack head -> ");
        Node cur = dummyHead.next;
        while (cur != null) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }
        sb.append("end");
        return sb.toString();
    }
}
