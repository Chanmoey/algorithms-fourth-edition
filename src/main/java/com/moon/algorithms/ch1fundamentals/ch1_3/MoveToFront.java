package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/27
 */
public class MoveToFront<E> {

    private class Node{
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private final Node dummyHead;

    public MoveToFront() {
        this.dummyHead = new Node(null);
    }

    public void add(E v) {
        Node prev = dummyHead;
        while (prev.next != null && !prev.next.value.equals(v)) {
            prev = prev.next;
        }

        if (prev.next != null) {
            Node move = prev.next;
            prev.next = move.next;
            move.next = dummyHead.next;
            dummyHead.next = move;
        } else {
            Node insert = new Node(v);
            insert.next = dummyHead.next;
            dummyHead.next = insert;
        }
    }

    @Override
    public String toString() {
        Node cur = dummyHead.next;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.value).append(" -> ");
            cur = cur.next;
        }

        return sb.toString();
    }
}
