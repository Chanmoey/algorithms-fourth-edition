package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise25 {

    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] array2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] array3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 1};


        // findFloorIn2SqrtN
        int floor = findFloorIn2SqrtN(array);
        StdOut.println("Floor: " + floor + " Expected: 7");

        int floor2 = findFloorIn2SqrtN(array2);
        StdOut.println("Floor: " + floor2 + " Expected: 0");

        int floor3 = findFloorIn2SqrtN(array3);
        StdOut.println("Floor: " + floor3 + " Expected: 40");

        // findFloorInCSqrtF
        floor = findFloorIn2SqrtN(array);
        StdOut.println("Floor: " + floor + " Expected: 7");

        floor2 = findFloorIn2SqrtN(array2);
        StdOut.println("Floor: " + floor2 + " Expected: 0");

        floor3 = findFloorIn2SqrtN(array3);
        StdOut.println("Floor: " + floor3 + " Expected: 40");
    }

    public static int findFloorIn2SqrtN(int[] array) {
        int key = 1;
        int sqrt = (int) Math.sqrt(array.length - 1);
        int lo = 0;
        int hi = 0;
        while (hi < array.length && array[hi] < key) {
            lo = hi;
            hi += sqrt;
        }

        hi = Math.min(hi, array.length - 1);
        for (int i = lo; i <= hi; i++) {
            if (array[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int findFloorInCSqrtF(int[] array) {
        int key = 1;
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < array.length; i++) {
            lo = hi;
            hi += i;
            if (hi >= array.length) {
                break;
            }
            if (array[hi] == key) {
                break;
            }
        }

        hi = Math.min(hi, array.length - 1);
        for (int i = lo; i <= hi; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
