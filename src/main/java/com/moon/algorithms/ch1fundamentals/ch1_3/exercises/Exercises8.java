package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.FixedCapacityStack;
import com.moon.algorithms.ch1fundamentals.ch1_3.Stack;

import java.lang.reflect.Field;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises8 {
    public static void main(String[] args) {
        // if the init capacity = 1, and the init size of stack is zero, but a.length = 1;
        // push it into the stack, size of stack = 1, and a.length = 1;            |it|
        // push was into the stack, size of stack = 2, and a.length = 2            |it|was|
        // pop the was from the stack, size of stack = 1, and a.length = 2         |it|-|
        // push the into the stack, size of stack = 2, and a.length = 2            |it|the|
        // push best into the stack, size of stack = 3, but a.length = 4           |it|the|best|-|
        // pop best into the stack, size of stack = 2, but a.length = 4            |it|the|-|-|
        // push of |it|the|of|-| a.length = 4
        // push times |it|the|of|times| a.length = 4
        // ......
        FixedCapacityStack<String> stack = new FixedCapacityStack<>(1);
        String[] word = "it was - the best - of times - - - it was - the - -".split(" ");
        for (String w : word) {
            if ("-".equals(w)) {
                stack.pop();
            } else {
                stack.push(w);
            }
            System.out.println("The size of Stack: " + stack.size() + " The length of array is: " + getStackArraySize(stack));
        }
    }

    private static int getStackArraySize(FixedCapacityStack<?> stack) {
        try {
            Field field = stack.getClass().getDeclaredField("a");
            field.setAccessible(true);
            Object[] a = (Object[]) field.get(stack);
            return a.length;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
