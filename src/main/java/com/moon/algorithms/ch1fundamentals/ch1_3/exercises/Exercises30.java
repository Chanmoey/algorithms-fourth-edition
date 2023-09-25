package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises30 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(arr);
        LinkedListUtil.printLinkedList(head);
        head = LinkedListUtil.reverse(head);
        LinkedListUtil.printLinkedList(head);

        head = LinkedListUtil.reverseRecursive(head);
        LinkedListUtil.printLinkedList(head);
    }
}
