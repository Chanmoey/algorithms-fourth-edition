package com.moon.algorithms.ch1fundamentals.ch1_5;

import com.moon.algorithms.ch1fundamentals.ch1_4.Stopwatch;
import com.moon.algorithms.std.StdIn;
import com.moon.algorithms.util.FileUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


/**
 * Test QuickFind
 */
public class QuickFindUnitTest {

    @Test
    public void testUnion() throws IOException {
        try (Scanner in = FileUtils.scannerFromFile("mediumUF.txt")) {
            Stopwatch stopwatch = new Stopwatch();
            int n = in.nextInt();
            in.nextLine();
            QuickFind uf = new QuickFind(n);
            for (int i = 0; i < n; i++) {
                int p = in.nextInt();
                int q = in.nextInt();
                in.nextLine();

                if (!uf.connected(p, q)){
                    uf.union(p, q);
                    System.out.println(p + " " + q);
                }
            }
            System.out.println(uf.count + " components");
            System.out.println(stopwatch.elapsedTime());
        }
    }
}