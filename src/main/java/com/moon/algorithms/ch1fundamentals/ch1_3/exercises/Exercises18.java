package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises18 {
    public static void main(String[] args) {
        ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedListUtil.printLinkedList(head);
        ListNode<Integer> x = head.getNext().getNext().getNext(); // 4
        x.setNext(x.getNext().getNext()); // del 5, but 5 still link the 6
        LinkedListUtil.printLinkedList(head);
    }
}
