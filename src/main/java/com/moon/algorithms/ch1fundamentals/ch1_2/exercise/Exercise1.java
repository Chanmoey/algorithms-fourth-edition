package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.Point2D;
import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdRandom;

import java.util.Random;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise1 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point = new Point2D(x, y);
            points[i] = point;
            point.draw();
        }

        Point2D[] nears = new Point2D[n];
        double[] dis = new double[n];
        for (int i = 0; i < n; i++) {
            double min = Double.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (!points[i].equals(points[j])) {
                    double itemDis = powerDis(points[i], points[j]);
                    if (itemDis < min) {
                        min = itemDis;
                        idx = j;
                    }
                }
            }
            nears[i] = points[idx];
            dis[i] = min;
        }

        for (int i = 0; i < n; i++) {
            StdDraw.line(points[i].x(), points[i].y(), nears[i].x(), nears[i].y());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(points[i] + "the distance separating the closest pair of points is " + dis[i]);
        }
    }

    private static double powerDis(Point2D p1, Point2D p2) {
        return Math.pow((p1.x() - p2.x()), 2) + Math.pow((p1.y() - p2.y()), 2);
    }
}
