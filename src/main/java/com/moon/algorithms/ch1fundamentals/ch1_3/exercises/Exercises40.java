package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.MoveToFront;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises40 {
    public static void main(String[] args) {
        MoveToFront<String> cache = new MoveToFront<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            cache.add(line);
            System.out.println(cache);
        }
    }
}
