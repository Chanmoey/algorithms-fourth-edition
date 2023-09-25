package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.In;
import com.moon.algorithms.std.Interval1D;
import com.moon.algorithms.std.Point2D;
import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < 2 * n; i++) {
            StdOut.print(Math.random());
            StdOut.print(" ");
        }
        In in = new In();
        for (int i = 0; i < n; i++) {
            double x = in.readDouble();
            double y = in.readDouble();
            double min = Math.min(x, y);
            double max = Math.max(x, y);
            StdOut.println(new Interval1D(min, max));
        }
    }
}
