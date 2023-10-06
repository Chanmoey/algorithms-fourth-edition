package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;


import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises47 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        stack1.connect(stack2);
        System.out.println(stack1);

        Queue<Integer> queue1 = new Queue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        Queue<Integer> queue2 = new Queue<>();
        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);

        queue1.connect(queue2);
        System.out.println(queue1);

        // steques same as stack
    }
}
