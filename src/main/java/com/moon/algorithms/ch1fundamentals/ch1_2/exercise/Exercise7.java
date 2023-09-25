package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise7 {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "ab";
        String str3 = "abc";
        String str4 = "abcd";
        String str5 = "abcde";
        System.out.println(mystery(str1));
        System.out.println(mystery(str2));
        System.out.println(mystery(str3));
        System.out.println(mystery(str4));
        System.out.println(mystery(str5));
    }

    /**
     * reverse a string
     */
    public static String mystery(String s)
    {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}
