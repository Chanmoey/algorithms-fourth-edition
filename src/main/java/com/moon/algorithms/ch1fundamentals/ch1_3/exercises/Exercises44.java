package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Buffer;
import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

import java.io.File;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises44 {
    public static void main(String[] args) {
        Buffer text = new Buffer();
        text.insert('1');
        System.out.println(text);
        text.insert('2');
        System.out.println(text);
        text.left(1);
        System.out.println(text);
        text.insert('3');
        System.out.println(text);
        text.right(1);
        System.out.println(text);
        text.delete();
        System.out.println(text);
    }
}
