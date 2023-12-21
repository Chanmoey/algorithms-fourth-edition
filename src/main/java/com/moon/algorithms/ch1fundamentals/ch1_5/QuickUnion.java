package com.moon.algorithms.ch1fundamentals.ch1_5;

/**
 * @author Chanmoey
 * @date 2023/12/18
 */
public class QuickUnion extends AbstractUF {
    public QuickUnion(int n) {
        super(n);
    }

    @Override
    public int find(int p) {
        while (p != this.id[p]) {
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot != qRoot) {
            this.id[pRoot] = qRoot;
            count--;
        }
    }
}
