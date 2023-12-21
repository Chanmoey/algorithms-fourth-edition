package com.moon.algorithms.ch1fundamentals.ch1_5;

/**
 * @author Chanmoey
 * @date 2023/12/14
 */
public abstract class AbstractUF implements UF{

    protected int[] id;
    protected int count;

    public AbstractUF(int n) {
        this.count = n;
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    @Override
    public abstract void union(int p, int q);

    @Override
    public abstract int find(int p);

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return this.count;
    }
}
