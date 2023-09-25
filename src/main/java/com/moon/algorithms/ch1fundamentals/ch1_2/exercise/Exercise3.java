package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.In;
import com.moon.algorithms.std.Interval1D;
import com.moon.algorithms.std.Interval2D;
import com.moon.algorithms.std.StdOut;
import com.moon.algorithms.std.StdRandom;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Interval2D[] interval2DS = new Interval2D[n];
        Interval1D[] x = new Interval1D[n];
        Interval1D[] y = new Interval1D[n];
        for (int i = 0; i < n; i++) {
            double x1 = StdRandom.uniformDouble(min, max);
            double y1 = StdRandom.uniformDouble(min, max);
            double x2 = StdRandom.uniformDouble(min, max);
            double y2 = StdRandom.uniformDouble(min, max);
            Interval1D i1 = new Interval1D(Math.min(x1, y1), Math.max(x1, y1));
            Interval1D i2 = new Interval1D(Math.min(x2, y2), Math.max(x2, y2));
            x[i] = i1;
            y[i] = i2;
            Interval2D interval2D = new Interval2D(i1, i2);
            interval2DS[i] = interval2D;
            interval2D.draw();
        }

        int intersectNum = 0;
        int contained = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (interval2DS[i].intersects(interval2DS[j])) {
                    intersectNum++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            boolean isContainOther = false;
            for (int j = 0; j < n; j++) {
                if (!interval2DS[i].equals(interval2DS[j])) {
                        Interval1D x1 = x[i];
                        Interval1D y1 = y[i];
                        Interval1D x2 = x[j];
                        Interval1D y2 = y[j];
                        if (x1.contains(x2.min()) && x1.contains(x2.max()) && y1.contains(y2.min()) && y1.contains(y2.max())) {
                            isContainOther = true;
                        }
                }
            }
            if (isContainOther) {
                contained++;
            }
        }
        StdOut.println(intersectNum);
        StdOut.println(contained);
    }
}
