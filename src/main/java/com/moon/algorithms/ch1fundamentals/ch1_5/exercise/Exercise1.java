package com.moon.algorithms.ch1fundamentals.ch1_5.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_5.AbstractUF;

/**
 * @author lijifa
 * @date 2023/12/21
 */
public class Exercise1 {

    public static void main(String[] args) {
        QuickFind uf = new QuickFind(10);
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

    public static class QuickFind extends AbstractUF {

        private int times;
        public QuickFind(int n) {
            super(n);
            this.times = 0;
        }

        public int getTimes() {
            return times;
        }

        @Override
        public void union(int p, int q) {
            int pId = find(p);
            int qId = find(q);
            if (pId == qId) {
                return;
            }

            for (int i = 0; i < id.length; i++) {
                this.times++;
                if (this.id[i] == pId) {
                    this.times++;
                    id[i] = qId;
                }
            }
            count--;
        }

        @Override
        public int find(int p) {
            this.times ++;
            return this.id[p];
        }
    }
}
