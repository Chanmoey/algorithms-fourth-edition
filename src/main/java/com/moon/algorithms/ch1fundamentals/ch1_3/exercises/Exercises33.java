package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Deque;
import com.moon.algorithms.ch1fundamentals.ch1_3.DequeByDoublyLinked;
import com.moon.algorithms.ch1fundamentals.ch1_3.DequeByResizingArray;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises33 {
    public static void main(String[] args) {
        System.out.println("**** Test DequeByDoublyLinked ****");
        testDequeByDoublyLinked();
        System.out.println("**** Test DequeByResizingArray ****");
        testDequeByResizingArray();
    }

    private static void testDequeByDoublyLinked() {
        Deque<Integer> deque1 = new DequeByDoublyLinked<>();
        deque1.pushLeft(1);
        deque1.pushRight(2);
        System.out.println(deque1);

        deque1.popLeft();
        System.out.println(deque1);
        deque1.popRight();
        System.out.println(deque1);
    }

    /**
     * The ChatGPT create this test code,
     */
    private static void testDequeByResizingArray() {
        DequeByResizingArray<Integer> deque = new DequeByResizingArray<>(5);
        deque.pushLeft(1);
        deque.pushLeft(2);
        deque.pushLeft(3);
        System.out.println(deque);
        System.out.println(deque.popLeft()); // output 3
        System.out.println(deque.popLeft()); // output 2

        System.out.println("--------------------------------");

        // test pushRight and popRight
        deque = new DequeByResizingArray<>(5);
        deque.pushRight(1);
        deque.pushRight(2);
        deque.pushRight(3);
        System.out.println(deque);
        System.out.println(deque.popRight()); // output 3
        System.out.println(deque.popRight()); // output 2

        System.out.println("--------------------------------");

        // test isEmpty and size
        deque = new DequeByResizingArray<>(5);
        System.out.println(deque.isEmpty()); // output true
        deque.pushLeft(1);
        deque.pushRight(2);
        System.out.println(deque.isEmpty()); // output false
        System.out.println(deque.size()); // output 2

        System.out.println("--------------------------------");

        // test toString
        deque = new DequeByResizingArray<>(5);
        deque.pushLeft(1);
        deque.pushRight(2);
        deque.pushLeft(3);
        System.out.println(deque); // output [3, 1, 2]
    }
}
