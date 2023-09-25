package com.moon.algorithms.ch1fundamentals.ch1_2;

public class Counter implements Comparable<Counter> {

    private final String name;     // counter name
    protected int count = 0;         // current value

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return count + " " + name;
    }

    @Override
    public int compareTo(Counter that) {
        return Integer.compare(this.count, that.count);
    }
}
