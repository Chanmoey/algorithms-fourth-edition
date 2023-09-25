package com.moon.algorithms.util;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */



public class LinkedListUtil {

    public static <T> ListNode<T> buildLinkedListFromArray(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Fuck You!");
        }
        ListNode<T> head = new ListNode<>(list.get(0), null);
        ListNode<T> prev = head;
        for (int i = 1; i < list.size(); i++) {
            prev.setNext(new ListNode<>(list.get(i), null));
            prev = prev.getNext();
        }
        return head;
    }

    public static <T> ListNode<T> buildLinkedListFromArray(T[] list) {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("Fuck You!");
        }
        ListNode<T> head = new ListNode<>(list[0], null);
        ListNode<T> prev = head;
        for (int i = 1; i < list.length; i++) {
            prev.setNext(new ListNode<>(list[i], null));
            prev = prev.getNext();
        }
        return head;
    }

    public static <T> void printLinkedList(ListNode<T> node) {
        ListNode<T> cur = node;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.getV()).append(" -> ");
            cur = cur.getNext();
        }
        sb.append("null");

        System.out.println(sb);
    }

    public static <T> boolean find(ListNode<T> node, T key) {
        ListNode<T> cur = node;
        while (cur != null) {
            if (cur.getV().equals(key)) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    public static <T> void removeAfter(ListNode<T> node) {
        if (node == null || node.getNext() == null) {
            return;
        }
        ListNode<T> del = node.getNext();
        node.setNext(del.getNext());
        del.setNext(null); // Help GC
    }

    public static <T> void insertAfter(ListNode<T> first, ListNode<T> second) {
        if (first == null || second == null) {
            return;
        }
        second.setNext(first.getNext());
        first.setNext(second);
    }

    public static <T> ListNode<T> remove(ListNode<T> head, T key) {
        if (head == null || key == null) {
            return head;
        }
        ListNode<T> dummyHead = new ListNode<>(null, head);
        ListNode<T> prev = dummyHead;
        while (prev.getNext() != null) {
            if (key.equals(prev.getNext().getV())) {
                ListNode<T> del = prev.getNext();
                prev.setNext(del.getNext());
                del.setNext(null); // Help GC
            } else {
                prev = prev.getNext();
            }
        }
        return dummyHead.getNext();
    }

    public static int max(ListNode<Integer> head) {
        if (head == null) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        ListNode<Integer> cur = head;
        while (cur != null) {
            max = Math.max(cur.getV(), max);
            cur = cur.getNext();
        }
        return max;
    }

    public static int maxRecursive(ListNode<Integer> head) {
        if (head == null) {
            return 0;
        }
        return Math.max(maxRecursive(head.getNext()), head.getV());
    }

    public static <T> ListNode<T> reverse(ListNode<T> head) {
        if (head == null) {
            return null;
        }

        ListNode<T> prev = null;
        ListNode<T> cur = head;
        ListNode<T> next;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static <T> ListNode<T> reverseRecursive(ListNode<T> head) {
        if (head == null) {
            return null;
        }

        return reverseRecursive(head, null);
    }

    public static <T> ListNode<T> reverseRecursive(ListNode<T> head, ListNode<T> next) {

        ListNode<T> headNext = head.getNext();
        head.setNext(next);

        if (headNext != null) {
            return reverseRecursive(headNext, head);
        }
        return head;
    }
}
