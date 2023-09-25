package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.std.Date;

import java.util.Objects;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class Transaction implements Comparable<Transaction>{

    private String who;

    private Date when;

    private double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        String[] a = transaction.split("\\s+");
        who    = a[0];
        when   = new Date(a[1]);
        amount = Double.parseDouble(a[2]);
        if (Double.isNaN(amount) || Double.isInfinite(amount))
            throw new IllegalArgumentException("Amount cannot be NaN or infinite");
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return who + " " +
                when + " " +
                amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj instanceof Transaction) {
            Transaction o = (Transaction) obj;
            return who.equals(o.who()) && when().equals(o.when) && amount == o.amount();
        }

        return false;
    }

    @Override
    public int compareTo(Transaction o) {
        return Double.compare(this.amount, o.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(who, when, amount);
    }
}
