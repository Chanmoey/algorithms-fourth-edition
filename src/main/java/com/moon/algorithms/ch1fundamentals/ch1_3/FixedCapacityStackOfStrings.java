package com.moon.algorithms.ch1fundamentals.ch1_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Chanmoey
 * @date 2023/9/18
 */
public class FixedCapacityStackOfStrings {

    private String[] a;
    private int n;

    public FixedCapacityStackOfStrings(int cap) {
        this.a = new String[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return this.n == a.length;
    }

    public int size() {
        return n;
    }

    public void push(String item) {
        a[n++] = item;
    }

    public String pop() {
        return a[--n];
    }
}
