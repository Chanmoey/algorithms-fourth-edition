package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Iterator;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class Bag<E> implements Iterable<E>{

    private Node first;

    private class Node{
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }
    }
    public void add(E e) {
        Node oldFirst = first;
        first = new Node(e);
        first.next = oldFirst;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {

        private Node cur = first;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public E next() {
            Node save = cur;
            cur = cur.next;
            return save.e;
        }
    }
}
