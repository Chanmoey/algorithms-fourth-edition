package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises23 {
    public static void main(String[] args) {
        ListNode<String> head = LinkedListUtil.buildLinkedListFromArray(List.of("Monica", "Chandler", "Joey", "Ross"));
        LinkedListUtil.printLinkedList(head);
        ListNode<String> x = head.getNext();
        ListNode<String> t = new ListNode<>("Rachel", null);
        x.setNext(t);
        t.setNext(x.getNext());
        LinkedListUtil.printLinkedList(head);
    }
}
