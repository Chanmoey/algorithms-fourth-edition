package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;


import com.moon.algorithms.ch1fundamentals.ch1_2.Counter;
import com.moon.algorithms.std.StdDraw;

/**
 * @author Chanmoey
 * @date 2023/9/14
 */
public class Exercise10 {

    public static void main(String[] args) throws InterruptedException {
        VisualCounter visualCounter = new VisualCounter("VisualCounter", 100, 50);
        for (int i = 0; i < 150; i++) {
            if (Math.random() < 0.1) {
                visualCounter.increment();
            } else {
                visualCounter.decrement();;
            }
        }
    }

    private static class VisualCounter extends Counter{

        private final int n;
        private final int max;

        public VisualCounter(String id, int n, int max) {
            super(id);
            this.n = n;
            this.max = max;
        }

        @Override
        public void increment() {
            if (canNotOperate()) {
                show();
                return;
            }
            super.increment();
            show();
        }

        public void decrement() {
            if (canNotOperate()) {
                show();
                return;
            }
            this.count --;
            show();
        }

        public void show() {
            StdDraw.text(0.5, 0.5, toString(), 1);
            StdDraw.pause(100);
            StdDraw.clear();
        }

        public boolean canNotOperate() {
            return n <= 0 || Math.abs(tally()) >= max;
        }
    }
}
