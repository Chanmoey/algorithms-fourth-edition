package com.moon.algorithms.ch1fundamentals.ch1_4.exercise;

import com.moon.algorithms.std.StdOut;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class Exercise19 {

    private static final int[][] DIR = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        int matrix1[][] = {{1}};
        int matrix2[][] = {{4, 1},
                {3, -2}};
        int matrix3[][] = {{5, 2, 3},
                {4, 6, 1},
                {7, 8, 9}};
        int matrix4[][] = {{5, 90, 3, 10},
                {4, -9, 1, 15},
                {7, -1, 9, 19},
                {12, 8, 13, 99}};
        int matrix5[][] = {{5, 90, 3, 10},
                {4,  1, -7, 15},
                {7, -1, -8, 19},
                {12, 8, 13, 99}};

        int localMinimum1 = localMinimumOfMatrix(matrix1);
        int localMinimum2 = localMinimumOfMatrix(matrix2);
        int localMinimum3 = localMinimumOfMatrix(matrix3);
        int localMinimum4 = localMinimumOfMatrix(matrix4);
        int localMinimum5 = localMinimumOfMatrix(matrix5);

        StdOut.println("Local Minimum Matrix: " + localMinimum1 + " Expected: 1");
        StdOut.println("Local Minimum Matrix: " + localMinimum2 + " Expected: -2");
        StdOut.println("Local Minimum Matrix: " + localMinimum3 + " Expected: 1"); //2 and 4 would also be valid
        StdOut.println("Local Minimum Matrix: " + localMinimum4 + " Expected: -9");
        StdOut.println("Local Minimum Matrix: " + localMinimum5 + " Expected: -8");
    }

    public static int localMinimumOfMatrix(int[][] m) {
        if (m.length == 1) {
            return m[0][0];
        }

        if (m.length == 2) {
            if (m[0][0] < m[0][1] && m[0][0] < m[1][0]) {
                return m[0][0];
            }
            if (m[0][1] < m[0][0] && m[0][1] < m[1][1]) {
                return m[0][1];
            }
            if (m[1][0] < m[0][0] && m[1][0] < m[1][1]) {
                return m[0][1];
            }
            return m[1][1];
        }

        return localMinimumOfMatrix(m, 0, m.length - 1, 0, m.length - 1);
    }

    private static int localMinimumOfMatrix(int[][] m, int rowStart, int rowEnd, int colStart, int colEnd) {

        int midRow = rowStart + (rowEnd - rowStart) / 2;
        int midCol = colStart + (colEnd - colStart) / 2;

        int[] minInRC = findMinimumInRowAndCol(m, midRow, midCol);
        int[] next = findLocalMinimum(m, minInRC[0], minInRC[1]);

        // minInRC is the minimum index in the matrix
        if (minInRC[0] == next[0] && minInRC[1] == next[1]) {
            return m[minInRC[0]][minInRC[1]];
        }

        // dfs
        if (next[0] < midRow) {
            if (next[1] < midCol) {
                return localMinimumOfMatrix(m, rowStart, midRow - 1, colStart, midCol - 1);
            } else {
                return localMinimumOfMatrix(m, rowStart, midRow - 1, midCol + 1, colEnd);
            }
        } else {
            if (next[1] < midCol) {
                return localMinimumOfMatrix(m, midRow + 1, rowEnd, colStart, midCol - 1);
            } else {
                return localMinimumOfMatrix(m, midRow + 1, rowEnd, midCol + 1, colEnd);
            }
        }
    }

    private static int[] findMinimumInRowAndCol(int[][] m, int row, int col) {
        int min = Integer.MAX_VALUE;
        int[] minIdx = new int[]{};

        for (int i = 0; i < m[0].length; i++) {
            if (m[row][i] < min) {
                min = m[row][i];
                minIdx = new int[]{row, i};
            }
        }

        for (int i = 0; i < m.length; i++) {
            if (m[i][col] < min) {
                min = m[i][col];
                minIdx = new int[]{i, col};
            }
        }

        return minIdx;
    }

    private static int[] findLocalMinimum(int[][] m, int x, int y) {
        int[] next = new int[]{x, y};
        int min = m[x][y];
        for (int[] d : DIR) {
            int nx = x + d[0];
            int ny = y + d[1];
            if (inArea(m, nx, ny) && m[nx][ny] < min) {
                min = m[nx][ny];
                next = new int[]{nx, ny};
            }
        }

        return next;
    }

    private static boolean inArea(int[][] m, int x, int y) {
        return x >= 0 && x < m.length && y >= 0 && y < m[0].length;
    }
}
