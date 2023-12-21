package com.moon.algorithms.ch1fundamentals.ch1_5;

import com.moon.algorithms.ch1fundamentals.ch1_4.Stopwatch;
import com.moon.algorithms.util.FileUtils;
import org.junit.Test;

import java.util.Scanner;

public class WeightedQuickUnionUFUnitTest {

    @Test
    public void weightedQuickUnionTest() {
        try (Scanner in = FileUtils.scannerFromFile("largeUF.txt")) {
            Stopwatch stopwatch = new Stopwatch();
            int n = in.nextInt();
            in.nextLine();
            UF qu = new WeightedQuickUnionUF(n);
            for (int i = 0; i < n; i++) {
                int p = in.nextInt();
                int q = in.nextInt();
                in.nextLine();

                if (!qu.connected(p, q)){
                    qu.union(p, q);
                }
            }
            System.out.println(qu.count() + " components");
            System.out.println(stopwatch.elapsedTime());
        }
    }
}