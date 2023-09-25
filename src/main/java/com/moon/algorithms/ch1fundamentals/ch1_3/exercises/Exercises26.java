package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises26 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (Math.random() < 0.5) {
                arr.add(1);
            } else {
                arr.add(2);
            }
        }

        ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(arr);
        LinkedListUtil.printLinkedList(head);
        ListNode<Integer> remove = LinkedListUtil.remove(head, 1);
        LinkedListUtil.printLinkedList(remove);
    }
}
