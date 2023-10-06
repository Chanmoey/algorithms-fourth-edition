package com.moon.algorithms.ch1fundamentals.ch1_4;

/**
 * @author Chanmoey
 * @date 2023/10/4
 */
public class Stopwatch {

    private long start;

    public Stopwatch(){
        this.start = System.currentTimeMillis();
    }

    public void reStart() {
        this.start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        return (System.currentTimeMillis() - this.start) / 1000.0;
    }
}
