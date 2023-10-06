package com.moon.algorithms.other;

import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdRandom;

/**
 * @author Chanmoey
 * @date 2023/10/3
 */
public class GetPi {

    private final double radius;
    private final long number;
    private static final double PI = Math.PI;

    public GetPi(double length, long number) {
        this.radius = length / 2;
        this.number = number;
    }

    private double[] nextPoint() {
        double x = StdRandom.uniformDouble(-this.radius, this.radius);
        double y = StdRandom.uniformDouble(-this.radius, this.radius);
        return new double[]{x, y};
    }

    private double error(double estimates){
        return Math.abs(PI - estimates);
    }

    private double computePi(long countInCircle, long totalCount3) {
        return 4 * (double) countInCircle / totalCount3;
    }

    public void visualization(){
        long count = 0;
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-this.radius, this.radius);
        StdDraw.setYscale(-this.radius, this.radius);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.circle(0, 0, this.radius);
        for (long i = 1; i <= this.number; i++) {
            double[] xy = nextPoint();
            double x = xy[0];
            double y = xy[1];
            StdDraw.setPenColor(StdDraw.BOOK_RED);
            if (Math.pow(x, 2) + Math.pow(y, 2) < Math.pow(this.radius, 2)) {
                count++;
                StdDraw.point(x, y);
            }
            StdDraw.setTitle("PI: " + computePi(count, i));
        }
        System.out.println(computePi(count, this.number));
    }

    public static void main(String[] args) {
        GetPi getPi = new GetPi(1, 10000);
        getPi.visualization();
    }
}
