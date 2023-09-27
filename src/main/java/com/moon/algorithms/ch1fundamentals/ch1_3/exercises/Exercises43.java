package com.moon.algorithms.ch1fundamentals.ch1_3.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_3.Queue;

import java.io.File;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2023/9/21
 */
public class Exercises43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String root = in.next();
        File file = new File(root);
        Queue<File> queue = new Queue<>();
        queue.enqueue(file);
        while (!queue.isEmpty()) {
            File cur = queue.dequeue();
            System.out.println(cur.toString());
            if (cur.isDirectory()) {
                File[] files = cur.listFiles();
                for (int i = 0; files != null && i < files.length; i++) {
                    queue.enqueue(files[i]);
                }
            }
        }
    }
}
