package com.moon.algorithms.ch1fundamentals.ch1_5;

/**
 * See{page 233}
 *
 * @author Chanmoey
 * @date 2023/12/13
 */
public interface UF {

    void union(int p, int q);

    int find(int p);

    boolean connected(int p, int q);

    int count();
}
