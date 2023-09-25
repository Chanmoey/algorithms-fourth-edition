package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise4 {

    public static void main(String[] args) {

        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        // world
        // hello
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
