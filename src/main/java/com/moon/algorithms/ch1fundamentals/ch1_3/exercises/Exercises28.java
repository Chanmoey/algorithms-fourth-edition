package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.std.StdRandom;
import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises28 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(StdRandom.uniformInt(10000));
        }
        ListNode<Integer> head = LinkedListUtil.buildLinkedListFromArray(arr);
        System.out.println(LinkedListUtil.maxRecursive(head));
        System.out.println(LinkedListUtil.max(head));
    }
}
