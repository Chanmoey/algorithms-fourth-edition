package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/22
 */
public class Exercises25 {

    public static void main(String[] args) {
        ListNode<String> head = LinkedListUtil.buildLinkedListFromArray(List.of("Monica", "Chandler", "Joey", "Ross"));
        LinkedListUtil.printLinkedList(head);
        LinkedListUtil.insertAfter(head.getNext(), new ListNode<>("Hello", null));
        LinkedListUtil.printLinkedList(head);
    }
}
