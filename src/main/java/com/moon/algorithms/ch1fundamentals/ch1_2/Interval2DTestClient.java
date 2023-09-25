package com.moon.algorithms.ch1fundamentals.ch1_2;

import com.moon.algorithms.std.Interval1D;
import com.moon.algorithms.std.Interval2D;
import com.moon.algorithms.std.Point2D;
import com.moon.algorithms.std.StdOut;

import java.awt.*;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Interval2DTestClient {

    public static void main(String[] args) {
        double xLo = Double.parseDouble(args[0]);
        double xHi = Double.parseDouble(args[1]);
        double yLo = Double.parseDouble(args[2]);
        double yHi = Double.parseDouble(args[3]);
        int t = Integer.parseInt(args[4]);

        Interval1D x = new Interval1D(xLo, xHi);
        Interval1D y = new Interval1D(yLo, yHi);
        Interval2D box = new Interval2D(x, y);
        box.draw();

        Counter c = new Counter("hits");
        for (int i = 0; i < t; i++) {
            double xPoint = Math.random();
            double yPoint = Math.random();
            Point2D p = new Point2D(xPoint, yPoint);
            if (box.contains(p)) {
                c.increment();
            } else {
                p.draw();
            }
        }

        StdOut.println(c);
        StdOut.println(box.area());
    }
}
