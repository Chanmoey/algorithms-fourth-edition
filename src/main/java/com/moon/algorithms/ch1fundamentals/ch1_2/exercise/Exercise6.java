package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise6 {

    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];
        System.out.println(isCircularRotation(s, t));
    }

    public static boolean isCircularRotation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s = s + s;
        return s.contains(t);
    }
}
