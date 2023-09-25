package com.moon.algorithms.ch1fundamentals.ch1_3;

import org.w3c.dom.Node;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */
public class DoublyLinkedList<E> {

    public class DoublyNode{
        private final E e;
        private DoublyNode prev;
        private DoublyNode next;

        public DoublyNode(E e) {
            this.e = e;
        }
    }

    private DoublyNode first;
    private DoublyNode last;
    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(E e) {
        if (first == null) {
            first = last = new DoublyNode(e);
        }  else {
            DoublyNode h = first;
            first = new DoublyNode(e);
            first.next = h;
            h.prev = first;
        }
        this.size ++;
    }

    public void addLast(E e) {
        if (last == null) {
            first = last = new DoublyNode(e);
        } else {
            DoublyNode t = last;
            last = new DoublyNode(e);
            t.next = last;
            last.prev = t;
        }
        this.size++;
    }

    public E removeFirst() {
        if (first == null) {
            throw new IllegalArgumentException("Linked List is Empty!");
        }

        DoublyNode del = first;
        if (first == last) {
            first = last = null;
        } else {
            first = first.next;
            first.prev = null;
        }

        del.next = null; // Help GC
        this.size --;
        return del.e;
    }

    public E removeLast() {
        if (last == null) {
            throw new IllegalArgumentException("Linked List is Empty!");
        }

        DoublyNode del = last;
        if (first == last) {
            first = last = null;
        } else {
            last = last.prev;
            last.next = null;
        }

        del.prev = null; // Help GC
        this.size --;
        return del.e;
    }

    public void insertBefore(DoublyNode node, E e) {
        checkNode(node);
        // save the prev node
        DoublyNode prev = node.prev;

        DoublyNode insert = new DoublyNode(e);
        insert.next = node;
        node.prev = insert;

        if (prev != null) {
            prev.next = insert;
            insert.prev = prev;
        } else  {
            // prev is null, so node is first, update the first pointer
            first = insert;
        }

        this.size++;
    }

    public void insertAfter(DoublyNode node, E e) {
        checkNode(node);
        // save the after node
        DoublyNode after = node.next;

        DoublyNode insert = new DoublyNode(e);
        node.next = insert;
        insert.prev = node;

        if (after != null) {
            insert.next = after;
            after.prev = null;
        } else {
            // after is null, so node is last, update the last pointer
            last = insert;
        }

        this.size++;
    }

    public void remove(DoublyNode node) {
        checkNode(node);
        DoublyNode prev = node.prev;
        DoublyNode after = node.next;

        if (prev == null && after == null) {
            // node is the only element in the list;
            first = last = null;
        } else if (prev != null && after == null) {
            // node is the last node in list
            last = prev;
            last.next = null;
            node.prev = null; // Help GC
        } else if (prev == null) {
            // node is the first node in list
            first = after;
            first.prev = null;
            node.next = null; // Help GC
        } else {
            prev.next = after;
            after.prev = prev;
        }

        this.size--;
    }

    private void checkNode(DoublyNode node) {
        if (node == null) {
            throw new IllegalArgumentException("Node can not be null!");
        }
    }

    public DoublyNode getFirstNode(E e) {
        DoublyNode cur = first;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "->";
        }
        StringBuilder sb = new StringBuilder();
        DoublyNode cur = first;
        while (cur != null) {
            sb.append(cur.e).append(" -> ");
            cur = cur.next;
        }

        return sb.toString();
    }
}
