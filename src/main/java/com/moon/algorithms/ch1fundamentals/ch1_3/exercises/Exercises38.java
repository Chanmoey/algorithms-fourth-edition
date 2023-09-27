package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.GeneralizedQueueByArray;
import com.moon.algorithms.ch1fundamentals.ch1_3.GeneralizedQueueByLinkedList;
import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises38 {
    public static void main(String[] args) {
        testGeneralizedQueueByLinkedList();
        testGeneralizedQueueByArray();
    }

    private static void testGeneralizedQueueByLinkedList() {
        GeneralizedQueueByLinkedList<Integer> gq = new GeneralizedQueueByLinkedList<>();
        for (int i = 0; i < 10; i++) {
            gq.insert(i);
        }
        System.out.println(gq);
        gq.delete(0); // delete 9
        System.out.println(gq);
        gq.delete(2); // delete 6
        System.out.println(gq);
        gq.delete(7); // delete 0
        System.out.println(gq);
    }

    private static void testGeneralizedQueueByArray() {
        GeneralizedQueueByArray<Integer> gq = new GeneralizedQueueByArray<>();
        for (int i = 0; i < 10; i++) {
            gq.insert(i);
        }
        System.out.println(gq);
        gq.delete(0); // delete 9
        System.out.println(gq);
        gq.delete(2); // delete 6
        System.out.println(gq);
        gq.delete(7); // delete 0
        System.out.println(gq);
    }
}
