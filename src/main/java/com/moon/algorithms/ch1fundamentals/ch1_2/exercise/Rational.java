package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

import com.moon.algorithms.ch1fundamentals.ch1_1.Gcd;

/**
 * @author Chanmoey
 * @date 2023/9/18
 */
public final class Rational {

    private final long numerator;
    private final long denominator;

    public Rational(long numerator, long denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("denominator must be a positive long number!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(Rational other) {
        this.numerator = other.getNumerator();
        this.denominator = other.getDenominator();;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public final Rational plus(Rational b) {

        if (this.numerator == 0) {
            return new Rational(b);
        }
        if (b.getNumerator() == 0) {
            return new Rational(this);
        }

        long numerator = (this.getNumerator() * b.getDenominator() + b.getNumerator() * this.getDenominator());
        long denominator = this.getDenominator() * b.getDenominator();
        return gcdRational(numerator, denominator, numerator < 0);
    }

    public final Rational minus(Rational b) {

        if (this.numerator == 0) {
            return new Rational(-1 * b.getNumerator(), b.getDenominator());
        }
        if (b.getNumerator() == 0) {
            return new Rational(this);
        }

        long numerator = (this.getNumerator() * b.getDenominator() - b.getNumerator() * this.getDenominator());
        long denominator = this.getDenominator() * b.getDenominator();
        return gcdRational(numerator, denominator, numerator < 0);
    }

    public final Rational times(Rational b) {

        if (this.numerator == 0 || b.getNumerator() == 0) {
            return new Rational(0, 0);
        }

        long numerator = (this.getNumerator() * b.getNumerator());
        long denominator = this.getDenominator() * b.getDenominator();
        return gcdRational(numerator, denominator, numerator < 0);
    }

    public final Rational divides(Rational b) {

        if (b.getNumerator() == 0) {
            throw new IllegalArgumentException("/ by zero");
        }

        if (this.numerator == 0) {
            return new Rational(0, 0);
        }

        long negative = b.getNumerator() < 0 ? -1L : 1L;
        return times(new Rational(negative * b.getDenominator(), negative * b.getNumerator()));
    }

    private Rational gcdRational(long numerator, long denominator, boolean negative) {
        long gcd = gcd(Math.abs(numerator), denominator);
        if (negative) {
            return new Rational(- 1 * numerator / gcd, denominator / gcd);
        }
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public long gcd(long p, long q) {

        if ((p & Long.MIN_VALUE) == Long.MIN_VALUE || (q & Long.MIN_VALUE) == Long.MIN_VALUE) {
            throw new IllegalArgumentException("p and q must be positive long number!");
        }

        if (q == 0) {
            return p;
        }
        long r = p % q;
        return gcd(q, r);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj instanceof Rational) {
            Rational o = (Rational) obj;
            return this.numerator == o.getNumerator() && this.denominator == o.getDenominator();
        }

        return false;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
