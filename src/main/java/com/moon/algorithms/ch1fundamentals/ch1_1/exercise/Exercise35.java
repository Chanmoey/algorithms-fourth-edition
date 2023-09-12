package com.moon.algorithms.ch1fundamentals.ch1_1.exercise;

import com.moon.algorithms.std.StdRandom;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Chanmoey
 * @date 2023/9/12
 */
public class Exercise35 {

    public static void main(String[] args) {

        double[] trueProbability = trueProbability();
        double[] random = godThrowsDice(1000000);
        double error = 0.0009999;
        for (int i = 0; i < random.length; i++) {
            if (Math.abs(random[i] - trueProbability[i]) > error) {
                System.out.println("misfit");
                return;
            }
        }
        System.out.println("cool");
    }

    private static double[] trueProbability() {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;
        return dist;
    }

    private static double[] godThrowsDice(int n) {
        double[] dist = new double[2 * 6 + 1];
        for (int i = 0; i < n; i++) {
            int first = StdRandom.uniformInt(1, 7);
            int second = StdRandom.uniformInt(1, 7);
            dist[first + second] ++;
        }
        for (int i = 2; i <= 12; i++) {
            dist[i] = dist[i] / n;
        }

        return dist;
    }
}

