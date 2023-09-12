package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.std.StdRandom;
import com.moon.algorithms.util.PrintUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise34 {

    public static void main(String[] args) {
        StdRandom.setSeed(1);
        int n = 1000;
        double[] stream = new double[n];
        for (int i = 0; i < n; i++) {
            stream[i] = StdRandom.uniformDouble();
        }

        System.out.println(Arrays.toString(filterMinAndMax(stream)));

        System.out.println(getMedianNumber(stream));

        int k = 10;
        System.out.println(getKthMin(stream, k));
        System.out.println(stream[k - 1]);

        System.out.println(sumOfSquares(stream));

        System.out.println(mean(stream));

        System.out.println(greaterThanMean(stream));

        printArrayInOrderAsc(stream);

        printArrayInRandomOrder(stream);
    }

    /**
     * just need to save min value and max value;
     */
    private static double[] filterMinAndMax(double[] array) {
        double[] minAndMax = new double[2];
        minAndMax[0] = array[0];
        minAndMax[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minAndMax[0]) {
                minAndMax[0] = array[i];
            } else if (array[i] > minAndMax[1]) {
                minAndMax[1] = array[i];
            }
        }

        return minAndMax;
    }

    /**
     * need to save all element
     */
    private static double getMedianNumber(double[] array) {

        Arrays.sort(array);

        if (array.length % 2 == 1) {
            return array[array.length / 2];
        }

        int right = array.length / 2;
        int left = right - 1;
        return (array[left] + array[right]) / 2;
    }

    /**
     * just neet to save k element;
     */
    private static double getKthMin(double[] array, int k) {

        if (array.length < k) {
            throw new IllegalArgumentException("array size must greater than k");
        }

        // maxHeap
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (double v : array) {
            if (pq.size() < k) {
                pq.add(v);
            } else {
                if (v < pq.peek()) {
                    pq.remove();
                    pq.add(v);
                }
            }
        }

        return pq.remove();
    }

    /**
     * not need to save all element, just save the sum, we can make the sum become the member value;
     */
    private static double sumOfSquares(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v * v;
        }
        return sum;
    }

    /**
     * need to sava all element
     */
    private static double mean(double[] array) {
        return Arrays.stream(array).sum() / array.length;
    }

    /**
     * need to save all element, because we need to compute the mean value
     */
    private static double greaterThanMean(double[] array) {
        double mean = mean(array);
        int count = 0;
        for (double v : array) {
            if (v > mean) {
                count++;
            }
        }

        return 1.0 * count / array.length;
    }

    /**
     * need to save all element
     */
    private static void printArrayInOrderAsc(double[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * maybe we don't need to save all element;
     */
    private static void printArrayInRandomOrder(double[] array) {
        double save = array[0];
        for (double v : array) {
            if (StdRandom.uniformDouble() < 0.5) {
                System.out.println(v);
            } else {
                System.out.println(save);
                save = v;
            }
        }
        System.out.println(save);
    }
}

