package com.moon.algorithms.ch1fundamentals.ch1_4;

import com.moon.algorithms.std.StdRandom;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class ThreeSumTest {

    @Test
    public void threeSumTest() {
        int n = 5000;
        int[] a = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            while (true) {
                int r = StdRandom.uniformInt(-n, n);
                if (!set.contains(r)) {
                    a[i] = r;
                    set.add(r);
                    break;
                }
            }
        }
        Assert.assertEquals(ThreeSum.count(a), ThreeSumFast.count(a));
    }
}
