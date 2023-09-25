package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.DoublyLinkedList;
import com.moon.algorithms.util.LinkedListUtil;
import com.moon.algorithms.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises31 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        System.out.println(list);
        list.addLast(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        DoublyLinkedList<Integer>.DoublyNode node = list.getFirstNode(2);
        list.insertBefore(node, 4);
        System.out.println(list);
        list.insertAfter(node, 5);
        System.out.println(list);
        list.remove(node);
        System.out.println(list);
    }
}
