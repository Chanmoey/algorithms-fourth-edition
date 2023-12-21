package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_3.FixedCapacityStack;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/12/12
 */
public class Exercise37 {

    public static void main(String[] args) {
        double prev = intTimeCounter(125);
        for (long i = 250; i <= 100000000L; i += i) {
            double time = integerTimeCounter(i);
            StdOut.printf("%6d %7.1f ", i, time);
            StdOut.printf("%5.1f\n", time / prev);
            prev = time;
        }

        prev = integerTimeCounter(125);
        for (long i = 250; i <= 100000000L; i += i) {
            double time = integerTimeCounter(i);
            StdOut.printf("%6d %7.1f ", i, time);
            StdOut.printf("%5.1f\n", time / prev);
            prev = time;
        }
    }

    private static double intTimeCounter(long times) {
        FixedCapacityStackOfInts stack = new FixedCapacityStackOfInts();
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            stack.push(i);
            stack.pop();
        }
        long end = System.nanoTime();
        return (end - start) / 1e9;
    }

    private static double integerTimeCounter(long times) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<>(16);
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            stack.push(i);
            stack.pop();
        }
        long end = System.nanoTime();
        return (end - start) / 1e9;
    }

    private static class FixedCapacityStackOfInts {

        private int[] data;
        private int size;

        public FixedCapacityStackOfInts(int cap) {
            this.data = new int[cap];
            this.size = 0;
        }


        public FixedCapacityStackOfInts() {
            this(16);
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void push(int item) {
            if (size == data.length) {
                resize(data.length << 1);
            }
            data[size++] = item;
        }

        public int pop() {
            int e = data[--size];
            if (size > 0 && size <= (data.length >> 2)) {
                resize(data.length >> 1);
            }

            return e;
        }

        private void resize(int max) {
            int[] temp = new int[max];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
    }
}
