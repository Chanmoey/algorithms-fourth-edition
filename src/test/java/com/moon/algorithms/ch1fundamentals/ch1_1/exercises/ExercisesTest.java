package com.moon.algorithms.ch1fundamentals.ch1_1.exercises;

import com.moon.algorithms.ch1fundamentals.ch1_1.BinarySearch;
import com.moon.algorithms.ch1fundamentals.ch1_1.Fibonacci;
import com.moon.algorithms.ch1fundamentals.ch1_1.Gcd;
import com.moon.algorithms.std.In;
import com.moon.algorithms.std.StdDraw;
import com.moon.algorithms.std.StdOut;
import com.moon.algorithms.std.StdRandom;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

/**
 * see {page 54}
 *
 * @author Chanmoey
 * @date 2023/9/8
 */
public class ExercisesTest {

    @Test
    public void first() {
        // 7
        System.out.println((0 + 15) / 2);

        // 200.0000002
        System.out.println(2.0e-6 * 100000000.1);

        // true
        System.out.println(true && false || true && true);
    }

    @Test
    public void second() {
        // 1.618
        System.out.println((1 + 2.236) / 2);
        // 10.0
        System.out.println(1 + 2 + 3 + 4.0);
        // true
        System.out.println(4.1 >= 4);
        // 33
        System.out.println(1 + 2 + "3");
    }

    @Test
    public void third() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    @Test
    public void fourth() {
        // a. if (a > b) then c = 0; can not use then in Java

        // b. if a > b {c = 0:} you must use {} in if statements

        // c. if (a > b) c = 0; you can do it;
        int a = 0, b = 0, c;
        if (a > b)
            c = 0;
        // d. if (a > b) c = 0 else b = 0; c = 0 not a statements, you must use ";"
    }

    @Test
    public void fifth() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    @Test
    public void sixth() {
        // 0 1 1 2 3 ... f(n) = f(n - 1) + f(n - 2)
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void seventh() {
        //  a
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);

        // b
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        // c
        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    @Test
    public void eighth() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    @Test
    public void ninth() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(n & 1);
            n = n >> 1;
        }
        System.out.println(s = sb.reverse().toString());
    }

    @Test
    public void tenth() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void eleven() {
        boolean[][] array = new boolean[][]{
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };

        int row = array.length;
        int col = array[0].length;
        for (int i = 1; i <= col; i++) {
            StdOut.print("  ");
            StdOut.print(i);
        }
        StdOut.println();

        for (int i = 0; i < row; i++) {
            StdOut.print(i + 1);
            StdOut.print(" ");
            for (int j = 0; j < col; j++) {
                if (array[i][j]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
                StdOut.print(" ");
            }
            StdOut.println();
        }
    }

    @Test
    public void twelve() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }

    @Test
    public void thirteen() {
        Random random = new Random();
        int M = random.nextInt(5);
        int N = random.nextInt(5);
        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(M * N);
            }
        }

        int[][] arrayT = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arrayT[j][i] = array[i][j];
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
        for (int[] ints : arrayT) {
            System.out.println(Arrays.toString(ints));
        }
    }

    @Test
    public void fourteen() {
        Assert.assertEquals(0, lg(1));
        Assert.assertEquals(1, lg(2));
        Assert.assertEquals(1, lg(3));
        Assert.assertEquals(2, lg(4));
        Assert.assertEquals(2, lg(5));
        Assert.assertEquals(2, lg(6));
        Assert.assertEquals(2, lg(7));
        Assert.assertEquals(3, lg(8));
    }

    public static int lg(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("ERROR");
        }

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int item = 2;
        for (int i = 2; i < n; i++) {
            item *= 2;
            if (item == n) {
                return i;
            } else if (item > n) {
                return i - 1;
            }
        }
        throw new IllegalArgumentException("ERROR");
    }

    @Test
    public void fifteen() {
        int[] a = new int[]{0, 1, 2, 3, 3, 2, 1};
        int m = 4;
        Assert.assertEquals(a.length, Arrays.stream(histogram(a, m)).sum());
    }

    private static int[] histogram(int[] a, int m) {
        int[] ret = new int[m];
        for (int i : a) {
            if (i < m) {
                ret[i]++;
            }
        }
        return ret;
    }

    @Test
    public void sixteen() {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    @Test
    public void seventeen() {
        // exR2 can not stop;
        exR2(0);
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }

    @Test
    public void eighteen() {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        // mystery(a, b) == a * b

        System.out.println(mystery1(2, 25));
        System.out.println(mystery1(3, 11));
        // mystery1(a, b) == a^b
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery1(a * a, b / 2);
        }
        return mystery1(a * a, b / 2) * a;
    }

    @Test
    public void nineteen() {
        for (int i = 0; i < 100; i++) {
            StdOut.println(i + " " + Fibonacci.F(i));
        }

        for (int i = 0; i < 100; i++) {
            StdOut.println(i + " " + Fibonacci.FBetter(i));
        }
    }

    @Test
    public void twenty() {
        // ln(a * b) = ln(a) + lb(b)
        System.out.println(ln(2));
    }

    public static double ln(int n) {
        assert n > 0;
        if (n == 1) {
            return 0;
        }
        return Math.log(n) + ln(n - 1);
    }

    @Test
    public void twentyOne() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] row = input.split(" ");
        System.out.print(input);
        StdOut.print(" ");
        int first = Integer.parseInt(row[1]);
        int second = Integer.parseInt(row[2]);
        double res = (double) first / second;
        StdOut.printf("%.3f", res);
    }

    @Test
    public void twentyTwo() {
        BinarySearch.rankRecursive(10, new int[]{1, 2, 3, 5, 6, 11, 12, 13, 16, 20});
    }

    @Test
    public void twentyThree() {
        String option = "+";
        int[] whiteList = In.readInts("tinyW.txt");
        int[] filterList = In.readInts("tinyT.txt");
        Arrays.sort(whiteList);
        binarySearchTestClient(whiteList, filterList, option);
    }

    public void binarySearchTestClient(int[] whiteList, int[] filterList, String option) {
        if ("+".equals(option)) {
            for (int f : filterList) {
                if (BinarySearch.rank(f, whiteList) == -1) {
                    StdOut.println(f);
                }
            }
        } else {
            for (int f : filterList) {
                if (BinarySearch.rank(f, whiteList) != -1) {
                    StdOut.println(f);
                }
            }
        }
    }

    @Test
    public void twentyFour() {
        Gcd.gcdVisualization(105, 24);
        Gcd.gcdVisualization(1111111, 1234567);
    }

    @Test
    public void twentyFive() {
        // 求 a b 的最大公约数，如果 b == 0，那么 a b 的最大公约数等于a
        // a = q * b + r，假设 d 是 a b的公约数，那么d也是b和r的公约数
        // a b的公约数集合 = b r的公约数集合
        // 所以 a b的最大公约数 = b r的最大公约数，因此 gcd(a, b) = gcd(b, a mod b);
    }

    @Test
    public void twentySix() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        StdOut.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }

    @Test
    public void twentySeven() {
        binomial(100, 50, 0.5);
        double[][] memo = new double[101][51];
        for (double[] row : memo) {
            Arrays.fill(row, -1);
        }
        System.out.println(binomialMemo(100, 50, 0.25, memo));
    }

    public static double binomial(int N, int k, double p) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomialMemo(int N, int k, double p, double[][] memo) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;

        if (memo[N][k] != -1) {
            return memo[N][k];
        }

        memo[N][k] = (1.0 - p) * binomialMemo(N - 1, k, p, memo) + p * binomialMemo(N - 1, k - 1, p, memo);
        return memo[N][k];
    }

    @Test
    public void twentyEight() {
        int[] whiteList = In.readInts("tinyW.txt");
        System.out.println(Arrays.toString(whiteList));
        // tow 10 in whiteList
        whiteList[2] = 10;
        Arrays.sort(whiteList);
        System.out.println(Arrays.toString(whiteList));
        int[] removeDuplicates = removeDuplicates(whiteList);
        System.out.println(Arrays.toString(removeDuplicates));
    }

    public static int[] removeDuplicates(int[] arr) {
        int idx = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[idx - 1] != arr[i]) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        if (idx == arr.length) {
            return arr;
        }

        int[] temp = new int[idx];
        System.arraycopy(arr, 0, temp, 0, idx);
        return temp;
    }

    @Test
    public void twentyNine() {
        int[] whiteList = In.readInts("tinyW.txt");
        // tow 10 in whiteList
        whiteList[2] = 10;
        Arrays.sort(whiteList);
        System.out.println(Arrays.toString(whiteList));
        int idx = rank(10, whiteList);
        Assert.assertEquals(0, idx);
        int count = count(10, whiteList);
        Assert.assertEquals(2, count);
        for (int i = idx; i < idx + count; i++) {
            Assert.assertEquals(10, whiteList[i]);
        }
    }

    /**
     * find an index of first element which greater than key or equal key
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    public static int count(int key, int[] a) {
        int idx = rank(key, a);
        if (idx >= a.length || a[idx] != key) {
            return 0;
        }

        int count = 0;
        while (idx < a.length) {
            if (a[idx++] == key) {
                count++;
            }
        }

        return count;
    }

    @Test
    public void thirty() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] array = new boolean[n][n];
        relativelyPrime(array);
        for (boolean[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void relativelyPrime(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (!array[i][j]) {
                    if (Gcd.gcd(i, j) == 1) {
                        array[i][j] = true;
                        array[j][i] = true;
                    }
                }
            }
        }
    }

    @Test
    public void thirtyOne() throws InterruptedException, ExecutionException {
        showStdDraw(() -> drawNPointAndLine(10, 0.5));
    }

    private static void drawNPointAndLine(int n, double p) {
        double angle = 360.0 / n;
        double[][] points = new double[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = 1 * Math.cos(Math.toRadians(i * angle));
            points[i][1] = 1 * Math.sin(Math.toRadians(i * angle));
        }
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.circle(0, 0, 1);
        for (double[] point : points) {
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(point[0], point[1]);
        }
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.005);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double rd = StdRandom.uniformDouble();
                if (rd < p) {
                    StdDraw.line(points[i][0], points[i][1],
                            points[j][0], points[j][1]);
                }

            }
        }
        StdDraw.show();
    }

    public void showStdDraw(Runnable runnable) {
        SwingUtilities.invokeLater(runnable);
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    @Test
    public void thirtyTwo() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double l = in.nextDouble();
        double r = in.nextDouble();
        double diff = (r - l) / n;
        double[] barLine = new double[n];
        int count = in.nextInt();
        showStdDraw(() -> {
            StdRandom.setSeed(1);
            for (int i = 0; i < count; i++) {
                double next = StdRandom.uniformDouble() * (r - l) + l;
                for (int j = 1; j <= n; j++) {
                    if (l + j * diff > next) {
                        barLine[j - 1] ++;
                    }
                }
            }
            StdDraw.setXscale(r, l);
            StdDraw.setYscale(0, count);
            for (int i = 0; i < n; i++) {
                StdDraw.rectangle(l + i * diff, l + (i + 1) * diff, diff, barLine[i]);
            }
        });
    }
}

