package com.moon.algorithms.ch1fundamentals.ch1_5;

/**
 * @author Chanmoey
 * @date 2023/12/14
 */
public class QuickFind extends AbstractUF {
    public QuickFind(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }

        for (int i = 0; i < id.length; i++) {
            if (this.id[i] == pId) {
                id[i] = qId;
            }
        }
        count--;
    }

    @Override
    public int find(int p) {
        return this.id[p];
    }
}
