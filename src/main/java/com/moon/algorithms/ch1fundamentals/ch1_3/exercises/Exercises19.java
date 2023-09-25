package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises19 {
    public static void main(String[] args) {
        ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedListUtil.printLinkedList(head);
        ListNode<Integer> prev = new ListNode<>(-1, head);
        // find the prev node of the last node
        while (prev.getNext() != null) {
            if (prev.getNext().getNext() == null) {
                break;
            }
            prev = prev.getNext();
        }
        // del the last node in the linked list
        prev.setNext(null);
        LinkedListUtil.printLinkedList(head);
    }
}
