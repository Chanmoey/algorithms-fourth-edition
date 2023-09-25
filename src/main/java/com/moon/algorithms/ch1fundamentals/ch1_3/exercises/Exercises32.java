package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Steque;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises32 {
    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();
        System.out.println(steque);
        steque.push(1);
        System.out.println(steque);
        steque.push(2);
        System.out.println(steque);
        steque.push(3);
        System.out.println(steque);

        steque.pop();
        System.out.println(steque);

        steque.enqueue(4);
        System.out.println(steque);

        steque.pop();
        System.out.println(steque);
        steque.pop();
        System.out.println(steque);
        steque.pop();
        System.out.println(steque);
    }
}
