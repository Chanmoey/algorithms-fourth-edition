package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.util.PrintUtil;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise33 {

    public static void main(String[] args) {
        System.out.println(Matrix.dot(new double[]{1, 2, 3}, new double[]{4, 5, 6}));

        double[][] a = new double[][]{{1, 2}, {3, 4}};
        double[][] b = new double[][]{{5, 6}, {7, 8}};
        // c = [[19, 22], [43, 50]]
        PrintUtil.printTwoDimArray((Matrix.mult(a, b)));

        a = new double[][]{{1, 2}, {3, 4}, {5, 6}};
        b = new double[][]{{7, 8}, {9, 10}};
        PrintUtil.printTwoDimArray(Matrix.transpose(a));
        PrintUtil.printTwoDimArray(Matrix.transpose(b));

        a = new double[][]{{1, 2}, {3, 4}};
        double[] x = new double[]{5, 6};
        // [17
        //  39]
        System.out.println((Arrays.toString(Matrix.mult(a, x))));

        a = new double[][]{{4, 7}, {5, 8}, {6, 9}};
        double[] y = new double[]{1, 2, 3};
        // [17
        //  39]
        System.out.println((Arrays.toString(Matrix.mult(y, a))));
    }

    static class Matrix {
        public static double dot(double[] x, double[] y) {
            if (x.length != y.length) {
                throw new IllegalArgumentException("x size must equal y size");
            }
            double res = 0;
            for (int i = 0; i < x.length; i++) {
                res += x[i] * y[i];
            }
            return res;
        }

        public static double[][] mult(double[][] a, double[][] b) {
            int row = a.length;
            int m = a[0].length;
            if (m != b.length) {
                throw new IllegalArgumentException("a's col size must equal b's row size");
            }
            int col = b[0].length;
            double[][] c = new double[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    double[] bCol = new double[b.length];
                    for (int k = 0; k < b.length; k++) {
                        bCol[k] = b[k][j];
                    }
                    c[i][j] = dot(a[i], bCol);
                }
            }

            return c;
        }

        public static double[][] transpose(double[][] a) {
            // n * m
            int n = a.length;
            int m = a[0].length;

            double[][] t = new double[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    t[i][j] = a[j][i];
                }
            }

            return t;
        }

        public static double[] mult(double[][] a, double[] x) {
            if (a[0].length != x.length) {
                throw new IllegalArgumentException("a's col size must be equal x' size");
            }

            double[] res = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                res[i] = dot(x, a[i]);
            }
            return res;
        }

        public static double[] mult(double[] y, double[][] a) {
            if (y.length != a.length) {
                throw new IllegalArgumentException("y's size must be equal a's row size");
            }

            double[] res = new double[a[0].length];
            for (int i = 0; i < a[0].length; i++) {
                double[] col = new double[a.length];
                for (int j = 0; j < a.length; j++) {
                    col[j] = a[j][i];
                }
                res[i] = dot(col, y);
            }

            return res;
        }
    }
}

