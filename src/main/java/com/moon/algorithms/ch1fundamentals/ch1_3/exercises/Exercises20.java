package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("del " + i + "th node: ");
            ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            LinkedListUtil.printLinkedList(head);
            ListNode<Integer> dummyHead = new ListNode<Integer>(-1, head);
            ListNode<Integer> prev = dummyHead;
            // find the prev node of the last node
            for (int j = 1; j < i; j++)  {
                if (prev == null) {
                    break;
                }
                prev = prev.getNext();
            }
            if (prev == null || prev.getNext() == null) {
                System.out.println(i + "kh greater than list size");
                break;
            }
            if (prev.getNext() != null) {
                ListNode<Integer> del = prev.getNext();
                prev.setNext(del.getNext());
                del.setNext(null);
            }
            LinkedListUtil.printLinkedList(dummyHead.getNext());
        }
    }
}
