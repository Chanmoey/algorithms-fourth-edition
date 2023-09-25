package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises21 {
    public static void main(String[] args) {
        ListNode<String> head = LinkedListUtil.buildLinkedListFromArray(List.of("Monica", "Chandler", "Joey", "Ross"));
        System.out.println(LinkedListUtil.find(head, "Joey"));
        System.out.println(LinkedListUtil.find(head, "Rachel"));
    }
}
