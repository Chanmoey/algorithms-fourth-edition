package com.moon.algorithms.ch1fundamentals.ch1_1;

import com.moon.algorithms.std.In;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/9/8
 */
public class BinarySearchTest {

    /**
     * see {page 47}
     */
    @Test
    public void test() {
        int[] whiteList = In.readInts("tinyW.txt");
        int[] filterList = In.readInts("tinyT.txt");
        Arrays.sort(whiteList);
        for (int i : filterList) {
            if (BinarySearch.rank(i, whiteList) < 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * see {page 48}
     */
    @Test
    public void testLineSearchPerformance() {
        int[] whiteList = In.readInts("largeW.txt");
        int[] filterList = In.readInts("largeT.txt");
        Arrays.sort(whiteList);
        for (int i : filterList) {
            if (LineSearch.rank(i, whiteList) < 0) {
                System.out.println(i);
            }
        }
    }
}
