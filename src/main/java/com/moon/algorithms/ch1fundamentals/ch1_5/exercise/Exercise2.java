package com.moon.algorithms.ch1fundamentals.ch1_5.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_5.AbstractUF;
import com.moon.algorithms.ch1fundamentals.ch1_5.UF;

/**
 * @author lijifa
 * @date 2023/12/21
 */
public class Exercise2 {

    public static void main(String[] args) {
        QuickUnion uf = new QuickUnion(10);
        uf.union(9, 0);
        System.out.println(uf.getTimes());
        uf.union(3, 4);
        System.out.println(uf.getTimes());
        uf.union(5, 8);
        System.out.println(uf.getTimes());
        uf.union(7, 2);
        System.out.println(uf.getTimes());
        uf.union(2, 1);
        System.out.println(uf.getTimes());
        uf.union(5, 7);
        System.out.println(uf.getTimes());
        uf.union(0, 3);
        System.out.println(uf.getTimes());
        uf.union(4, 2);
        System.out.println(uf.getTimes());

    }

    public static class QuickUnion extends AbstractUF {

        private int times;
        public QuickUnion(int n) {
            super(n);
            this.times = 0;
        }

        public int getTimes() {
            return times;
        }

        @Override
        public int find(int p) {
            while (p != this.id[p]) {
                // read one times? or tow times?
                times += 2;
                p = id[p];
            }
            return p;
        }

        @Override
        public void union(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot != qRoot) {
                this.times += 1;
                this.id[pRoot] = qRoot;
                count--;
            }
        }
    }

}
