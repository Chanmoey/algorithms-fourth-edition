package com.moon.algorithms.ch1fundamentals.ch1_5;

import java.util.Arrays;

/**
 * @author Chanmoey
 * @date 2023/12/18
 */
public class WeightedQuickUnionUF extends AbstractUF {
    
    private final int[] sz;

    public WeightedQuickUnionUF(int n) {
        super(n);
        this.sz = new int[n];
        Arrays.fill(this.sz, 1);
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        if (i == j) {
            return;
        }

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count --;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
}
