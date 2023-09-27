package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.util.Iterator;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class Stack<E> implements Iterable<E>{

    private class Node{
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node first;
    private int n;

    public Stack() {

    }

    public Stack(Stack<E> s) {
        this.n = 0;
        Stack<E> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        while (!temp.isEmpty()) {
            E e = temp.pop();
            this.push(e);
            s.push(e);
        }
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public void push(E e) {
        Node oldFirst = first;
        first = new Node(e);
        first.next = oldFirst;
        this.n++;
    }

    public E pop() {
        if (first == null) {
            throw new IllegalArgumentException("Stack is Empty!");
        }
        Node del = first;
        E e = del.e;
        first = first.next;
        this.n--;
        del.next = null; // Help GC
        return e;
    }

    public E peek() {
        if (first == null) {
            throw new IllegalArgumentException("Stack is Empty!");
        }
        return first.e;
    }

    public static Stack<String> clone(Stack<String> stack) {
        Stack<String> temp = new Stack<>();
        for (String string : stack) {
            temp.push(string);
        }
        Stack<String> res = new Stack<>();
        for (String string : temp) {
            res.push(string);
        }
        return res;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListStackIterator();
    }

    private class ListStackIterator implements Iterator<E> {

        private Node cur = first;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public E next() {
            E e = cur.e;
            cur = cur.next;
            return e;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("top -> ");
        Node cur = first;
        while (cur != null) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }
        sb.append("end");
        return sb.toString();
    }
}
